package com.plan.dao;

import com.plan.entity.Plan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PlanMapper {

    int deleteByPrimaryKey(String id);

    int insert(Plan record);

    int insertSelective(Plan record);

    //直接调此方法会报对象序列化警告⚠️，因为web模块没有Plan对象
    Plan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKey(Plan record);

    List<Map<String, Object>> getPlanList(HashMap<String, Object> map);
}