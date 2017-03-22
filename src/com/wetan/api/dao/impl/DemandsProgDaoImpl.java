package com.wetan.api.dao.impl;

import com.wetan.api.dao.CapvisionFunSpBaseDao;
import com.wetan.api.dao.DemandsProgDao;
import com.wetan.api.pojo.DemandsProg;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dhu on 2017/3/20.
 */
@Component
public class DemandsProgDaoImpl extends CapvisionFunSpBaseDao<DemandsProg> implements DemandsProgDao {

    @Override
    public List<DemandsProg> getList(String clientAm, String ctype, int pageSize, int offset) {
        Map<String, Object> map = new HashMap<>();
        map.put("clientAm", clientAm);
        map.put("ctype", ctype);
        map.put("pageSize", pageSize);
        map.put("offset", offset);

        return findBy("select_list", map);
    }

    @Override
    public int getCount(String clientAm, String ctype) {
        Map<String, Object> map = new HashMap<>();
        map.put("clientAm", clientAm);
        map.put("ctype", ctype);

        return findUniqueBy("select_count", map);
    }

    @Override
    public int updateCtype(int id, String Ctype) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("Ctype", Ctype);

        return updateBy("update_ctype", map);
    }
}
