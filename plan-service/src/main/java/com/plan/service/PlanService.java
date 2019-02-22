package com.plan.service;

import com.plan.utils.bean.MessengerVo;

public interface PlanService {

    MessengerVo queryPlan(MessengerVo messenger);

    MessengerVo queryPlanList(MessengerVo messenger);

    MessengerVo savePlan(MessengerVo messenger);

    MessengerVo savePlanBatch(MessengerVo messenger);

    MessengerVo updatePlan(MessengerVo messenger);

    MessengerVo deletePlan(MessengerVo messenger);
}
