package com.plan.api.impl;

import com.plan.api.DPlanService;
import com.plan.service.PlanService;
import com.plan.utils.bean.MessengerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DPlanServiceImpl implements DPlanService {

    @Autowired
    PlanService PlanService;

    public MessengerVo getPlan(MessengerVo messenger) {
        return PlanService.getPlan(messenger);
    }
}
