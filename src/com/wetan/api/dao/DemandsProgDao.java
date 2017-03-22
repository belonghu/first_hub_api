package com.wetan.api.dao;

import com.wetan.api.pojo.DemandsProg;

import java.util.List;

/**
 * Created by dhu on 2017/3/20.
 */
public interface DemandsProgDao {

    List<DemandsProg> getList(String clientAm, String ctype, int pageSize, int offset);

    int getCount(String clientAm, String ctype);

    int updateCtype(int id, String Ctype);
}
