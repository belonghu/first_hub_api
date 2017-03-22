package com.wetan.api.sql;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class SqlDAO<T> extends SqlSessionDaoSupport {
    protected static final String DOT = ".";
    protected static final String UNDERLINE = "_";
    protected static final String SUFFIX_INSERT = "insert";
    protected static final String SUFFIX_UPDATE = "update";
    protected static final String SUFFIX_DELETE = "delete";
    protected static final String SUFFIX_SELECT = "select";
    protected static final String QUERY_COUNT = "count";
    protected static final String SUFFIX_SELECT_ALL = "select_all";
    protected static final String SUFFIX_DELETE_ALL = "delete_all";
    private Class<?> entityClass = getSuperClassGenericType(this.getClass(), 0);
    private boolean useSimpleName = true;
    private boolean useNamespace = true;

    public SqlDAO() {
    }

    public boolean isUseSimpleName() {
        return this.useSimpleName;
    }

    public void setUseSimpleName(boolean useSimpleName) {
        this.useSimpleName = useSimpleName;
    }

    public boolean isUseNamespace() {
        return this.useNamespace;
    }

    public void setUseNamespace(boolean useNamespace) {
        this.useNamespace = useNamespace;
    }

    public String getSqlStatementName(String statementName) {
        return this.useNamespace && this.entityClass != null?this.getSqlMapNamespace(this.entityClass) + "." + statementName:statementName;
    }

    public String getSqlMapNamespace(Class<?> entityClass) {
        return this.useSimpleName?entityClass.getSimpleName():entityClass.getName();
    }

    public Object getParameter(Object parameter) {
        return parameter;
    }

    public T get(Serializable id) {
        return this.getSqlSession().selectOne(this.getSqlStatementName("select"), this.getParameter(id));
    }

    public int delete(Serializable id) {
        return this.getSqlSession().delete(this.getSqlStatementName("delete"), this.getParameter(id));
    }

    public List<T> getAll() {
        return this.getSqlSession().selectList(this.getSqlStatementName("select_all"), this.getParameter((Object) null));
    }

    public <S> List<S> findBy(String statementName, Object parameterObject) {
        return this.getSqlSession().selectList(this.getSqlStatementName(statementName), this.getParameter(parameterObject));
    }

    public <S> S getObject(String statementName, Object parameter) {
        return this.getSqlSession().selectOne(this.getSqlStatementName(statementName), this.getParameter(parameter));
    }

    public <S> S findUniqueBy(String statementName, Object parameter) {
        return this.getSqlSession().selectOne(this.getSqlStatementName(statementName), this.getParameter(parameter));
    }

    public int updateBy(String statementName, Object parameterObject) {
        return this.getSqlSession().update(this.getSqlStatementName(statementName), this.getParameter(parameterObject));
    }

    public int deleteBy(String statementName, Object parameter) {
        return this.getSqlSession().delete(this.getSqlStatementName(statementName), this.getParameter(parameter));
    }

    public int insert(T o) {
        return this.getSqlSession().insert(this.getSqlStatementName("insert"), this.getParameter(o));
    }

    public int insertBy(String statementName, Object parameter) {
        return this.getSqlSession().insert(this.getSqlStatementName(statementName), this.getParameter(parameter));
    }

    public int update(T o) {
        return this.getSqlSession().update(this.getSqlStatementName("update"), this.getParameter(o));
    }

    public int deleteAll() {
        int rows = this.getSqlSession().delete(this.getSqlStatementName("delete_all"), this.getParameter((Object) null));
        return rows;
    }

    public Object callPro(String statementName, Object parameterObject) {
        return this.getSqlSession().selectOne(this.getSqlStatementName(statementName), parameterObject);
    }

    public int batchInsert(List<?> list, String statementName) {
        if(list != null && !list.isEmpty()) {
            String statement = this.getSqlStatementName(statementName);
            return this.getSqlSession().insert(statement, list);
        } else {
            return 0;
        }
    }

    public int batchInsert(Map<String, Object> map, String statementName) {
        if(map != null && !map.isEmpty()) {
            String statement = this.getSqlStatementName(statementName);
            return this.getSqlSession().insert(statement, map);
        } else {
            return 0;
        }
    }

    public int batchUpdate(List<?> list, String statementName) {
        if(list != null && !list.isEmpty()) {
            String statement = this.getSqlStatementName(statementName);
            return this.getSqlSession().update(statement, list);
        } else {
            return 0;
        }
    }

    public int batchUpdate(Map<String, Object> map, String statementName) {
        if(map != null && !map.isEmpty()) {
            String statement = this.getSqlStatementName(statementName);
            return this.getSqlSession().update(statement, map);
        } else {
            return 0;
        }
    }

    public int count(String statementName, Object parameter) {
        return (Integer) this.getSqlSession().selectOne(statementName, this.getParameter(parameter));
    }

    private static Class<?> getSuperClassGenericType(Class<?> clazz, int index) {
        ParameterizedType type = null;
        Type temp = clazz.getGenericSuperclass();

        do {
            if(temp instanceof ParameterizedType) {
                type = (ParameterizedType)temp;
                break;
            }

            if(!(temp instanceof Class)) {
                break;
            }

            temp = ((Class)temp).getGenericSuperclass();
        } while(temp != Object.class && temp != null);

        if(type == null) {
            return null;
        } else {
            Type[] params = type.getActualTypeArguments();
            if(index < params.length && index >= 0) {
                return !(params[index] instanceof Class)?null:(Class)params[index];
            } else {
                throw new RuntimeException("the index must be between 0 and " + (params.length - 1));
            }
        }
    }
}