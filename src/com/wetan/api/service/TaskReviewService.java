package com.wetan.api.service;

import com.wetan.api.pojo.TaskReview;

import java.util.List;

/**
 * Created by dhu on 2017/3/21.
 */
public interface TaskReviewService {

    List<TaskReview> getList(String autoPicDiff, int pageSize, int page);

    int getCount(String autoPicDiff);

    int updateAutoPicDiff(int taskId, String autoPicDiff);
}
