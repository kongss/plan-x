package com.plan.api;

import com.plan.utils.bean.MessengerVo;

public interface DPlanService {

    MessengerVo queryPlan(MessengerVo messenger);

    MessengerVo queryPlanList(MessengerVo messenger);

    MessengerVo savePlan(MessengerVo messenger);

    MessengerVo savePlanBatch(MessengerVo messenger);

    MessengerVo updatePlan(MessengerVo messenger);

    MessengerVo deletePlan(MessengerVo messenger);


}
