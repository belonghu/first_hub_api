package com.wetan.api.dao;

import com.wetan.api.sql.SqlDAO;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.annotation.Resource;

public class CapvisionFunSpBaseDao<T> extends SqlDAO<T> {
    public CapvisionFunSpBaseDao() {
    }

    @Resource(name = "CapvisionFunSpSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
