package com.wetan.api.dao;

import com.wetan.api.pojo.TaskReview;

import java.util.List;

/**
 * Created by dhu on 2017/3/21.
 */
public interface TaskReviewDao {

    List<TaskReview> getList(String autoPicDiff, int pageSize, int offset);

    int getCount(String autoPicDiff);

    int updateAutoPicDiff(int taskId, String autoPicDiff);
}
