package com.wetan.api.action;

import com.alibaba.fastjson.JSONObject;
import com.wetan.api.service.DemandsProgService;
import com.wetan.api.util.PageUtil;
import com.wetan.api.util.RequestUtil;
import com.wetan.api.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;

/**
 * Created by dhu on 2017/3/20.
 */
@Controller("api/wetan/npt")
@Path("api/wetan/npt")
public class DemandsProgAction {

    @Autowired
    private DemandsProgService demandsProgService;

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
        String type = jsonObj.getString("clientAm");
        String ctype = jsonObj.getString("ctype");
        int pageSize = jsonObj.getInteger("page_size") == null ? 50 : jsonObj.getInteger("page_size");
        int page = jsonObj.getInteger("page") == null ? 1 : jsonObj.getInteger("page");
        int offset = (page - 1) * pageSize;
        if (type == null) {
            type =  "";
        }

        return ResponseUtil.returnJson(PageUtil.pageUtile(demandsProgService.getList(type,ctype, pageSize, offset), demandsProgService.getCount(type,ctype)));
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
        String type = jsonObj.getString("ctype");
        int id = jsonObj.getInteger("id");

        demandsProgService.updateCtype(id, type);

        return ResponseUtil.returnSuccess();
    }
}
