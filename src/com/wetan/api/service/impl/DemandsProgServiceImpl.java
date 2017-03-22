package com.wetan.api.service.impl;

import com.wetan.api.dao.DemandsProgDao;
import com.wetan.api.pojo.DemandsProg;
import com.wetan.api.service.DemandsProgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dhu on 2017/3/20.
 */
@Component
public class DemandsProgServiceImpl implements DemandsProgService {

    @Autowired
    private DemandsProgDao demandsProgDao;

    @Override
    public List<DemandsProg> getList(String clientAm, String ctype, int pageSize, int offset) {

        List<DemandsProg> list = demandsProgDao.getList(clientAm, ctype, pageSize, offset);

        if (list != null && list.size() > 0) {
            for (DemandsProg demandsProg : list) {
                if (StringUtils.isNotEmpty(demandsProg.getLabels())) {
                    demandsProg.setLabel_arr(demandsProg.getLabels().split(","));
                }
            }
        }
        return list;
    }

    @Override
    public int getCount(String clientAm, String ctype) {

        return demandsProgDao.getCount(clientAm, ctype);
    }

    @Override
    public int updateCtype(int id, String cType) {

        return demandsProgDao.updateCtype(id, cType);
    }
}
