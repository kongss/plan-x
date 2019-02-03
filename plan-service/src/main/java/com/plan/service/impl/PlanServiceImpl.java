package com.plan.service.impl;

import com.plan.dao.PlanMapper;
import com.plan.entity.Plan;
import com.plan.service.PlanService;
import com.plan.utils.bean.MessengerVo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PlanServiceImpl implements PlanService {

    @Resource
    PlanMapper PlanMapper;

    public MessengerVo queryPlan(MessengerVo messenger) {
        String id = messenger.getString("id");
        Plan plan = PlanMapper.selectByPrimaryKey(id);
        messenger.setInfo("plan", plan);
        return messenger;
    }
}
