package com.wetan.api.service;

import com.wetan.api.pojo.DemandsProg;

import java.util.List;

/**
 * Created by dhu on 2017/3/20.
 */
public interface DemandsProgService {

    List<DemandsProg> getList(String clientAm, String ctype, int pageSize, int offset);

    int getCount(String clientAm, String ctype);

    int updateCtype(int id, String cType);
}
