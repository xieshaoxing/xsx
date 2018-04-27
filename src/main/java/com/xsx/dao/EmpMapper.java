package com.xsx.dao;

import com.xsx.entity.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(String id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}