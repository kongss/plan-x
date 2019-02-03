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

    public MessengerVo queryPlan(MessengerVo messenger) {
        return PlanService.queryPlan(messenger);
    }

    public MessengerVo queryPlanList(MessengerVo messenger) {
        return null;
    }

    public MessengerVo savePlan(MessengerVo messenger) {
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
