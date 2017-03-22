package com.wetan.api.action;

import com.alibaba.fastjson.JSONObject;
import com.wetan.api.service.TaskReviewService;
import com.wetan.api.util.PageUtil;
import com.wetan.api.util.RequestUtil;
import com.wetan.api.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;

/**
 * Created by dhu on 2017/3/21.
 */
@Controller("api/wetan/task_review")
@Path("api/wetan/task_review")
public class TaskReviewAction {

    @Autowired
    private TaskReviewService taskReviewService;

    @GET
    @Path("ping")
    public String main() {
        return "pong!";
    }

    @POST
    @Path("list")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public String getOptionList(
            @Context HttpServletRequest request
    ) {
        String reqBody = RequestUtil.getPostBody(request);

        JSONObject jsonObj = JSONObject.parseObject(reqBody);
        String autoPicDiff = jsonObj.getString("auto_pic_diff");
        int pageSize = jsonObj.getInteger("page_size") == null ? 50 : jsonObj.getInteger("page_size");
        int page = jsonObj.getInteger("page") == null ? 1 : jsonObj.getInteger("page");
        int offset = (page - 1) * pageSize;

        return ResponseUtil.returnJson(PageUtil.pageUtile(taskReviewService.getList(autoPicDiff, pageSize, offset), taskReviewService.getCount(autoPicDiff)));
    }

    @POST
    @Path("update")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public String updateCType(
            @Context HttpServletRequest request
    ) {
        String reqBody = RequestUtil.getPostBody(request);

        JSONObject jsonObj = JSONObject.parseObject(reqBody);
        int taskId = jsonObj.getInteger("task_id");
        String autoPicDiff = jsonObj.getString("auto_pic_diff");


        taskReviewService.updateAutoPicDiff(taskId, autoPicDiff);

        return ResponseUtil.returnSuccess();
    }
}
