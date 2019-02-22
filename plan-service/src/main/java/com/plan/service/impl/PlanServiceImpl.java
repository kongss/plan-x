package com.plan.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.plan.dao.PlanMapper;
import com.plan.dao.ProjectMapper;
import com.plan.entity.Plan;
import com.plan.entity.Project;
import com.plan.service.PlanService;
import com.plan.service.ProjectService;
import com.plan.utils.bean.MessengerVo;
import com.plan.utils.date.DateUtils;
import com.plan.utils.utils.HuUUID;
import com.plan.utils.utils.IdWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 系统内部逻辑处理
 */

@Service
public class PlanServiceImpl implements PlanService {

    private final static Logger logger = LoggerFactory.getLogger(PlanServiceImpl.class);

    @Resource
    PlanMapper planMapper;

    @Resource
    ProjectMapper projectMapper;

    public MessengerVo queryPlan(MessengerVo messenger) {
        MessengerVo resVo = new MessengerVo();
        logger.info("通过id查询Plan信息参数:{}", JSON.toJSONString(messenger));
        String id = messenger.getString("id");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        List<Map<String, Object>> planList = planMapper.getPlanList(map);
        resVo.setInfo("planList", planList);
        logger.info("通过id查询Plan信息结果:{}", JSON.toJSONString(resVo));
        return resVo;
    }

    public MessengerVo queryPlanList(MessengerVo messenger) {
        return null;
    }

    public MessengerVo savePlan(MessengerVo messenger) {
        try {
            String planJson = messenger.getString("plan");
            JSONObject obj = JSONObject.parseObject(planJson);
            Plan plan = new Plan();
            plan.setId(HuUUID.getUuid());
            plan.setTitle(obj.getString("title"));
            plan.setSynopsis(obj.getString("synopsis"));
            plan.setBeginTime(DateUtils.strToDate(obj.getString("beginTime")));
            plan.setEndTime(DateUtils.strToDate(obj.getString("endTime")));
            plan.setCode(obj.getString("code"));
            plan.setInsertTime(new Date());
            plan.setStatus(1);
            plan.setFounder(obj.getString("founder"));
            planMapper.insertSelective(plan);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public MessengerVo savePlanBatch(MessengerVo messenger) {
        return null;
    }

    public MessengerVo updatePlan(MessengerVo messenger) {
        return null;
    }

    public MessengerVo deletePlan(MessengerVo messenger) {
        return null;
    }
}
