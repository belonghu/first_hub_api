package com.wetan.api.dao.impl;

import com.wetan.api.dao.CapvisionFunSpBaseDao;
import com.wetan.api.dao.TaskReviewDao;
import com.wetan.api.pojo.TaskReview;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dhu on 2017/3/21.
 */
@Component
public class TaskReviewDaoImpl extends CapvisionFunSpBaseDao<TaskReview> implements TaskReviewDao {

    @Override
    public List<TaskReview> getList(String autoPicDiff, int pageSize, int offset) {
        Map<String, Object> map = new HashMap<>();
        map.put("autoPicDiff", autoPicDiff);
        map.put("pageSize", pageSize);
        map.put("offset", offset);

        return findBy("select_list", map);
    }

    @Override
    public int getCount(String autoPicDiff) {
        Map<String, Object> map = new HashMap<>();
        map.put("autoPicDiff", autoPicDiff);

        return findUniqueBy("select_count", map);
    }

    @Override
    public int updateAutoPicDiff(int taskId, String autoPicDiff) {
        Map<String, Object> map = new HashMap<>();
        map.put("taskId", taskId);
        map.put("autoPicDiff", autoPicDiff);

        return updateBy("update_auto_pick_diff", map);
    }
}
