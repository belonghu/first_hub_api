package com.wetan.api.service.impl;

import com.wetan.api.dao.TaskReviewDao;
import com.wetan.api.pojo.TaskReview;
import com.wetan.api.service.TaskReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dhu on 2017/3/21.
 */
@Component
public class TaskReviewServiceImpl implements TaskReviewService {

    @Autowired
    private TaskReviewDao taskReviewDao;

    @Override
    public List<TaskReview> getList(String autoPicDiff, int pageSize, int page) {
        if (page < 1) {
            page = 1;
        }
        int offset = (page - 1) * pageSize;

        return taskReviewDao.getList(autoPicDiff, pageSize, offset);
    }

    @Override
    public int getCount(String autoPicDiff) {

        return taskReviewDao.getCount(autoPicDiff);
    }

    @Override
    public int updateAutoPicDiff(int taskId, String autoPicDiff) {

        return updateAutoPicDiff(taskId, autoPicDiff);
    }
}
