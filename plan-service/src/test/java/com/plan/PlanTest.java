package com.plan;

import com.plan.api.DPlanService;
import com.plan.utils.bean.MessengerVo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlanTest {
    static ClassPathXmlApplicationContext context;
    static DPlanService service;
    static {
        context = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext.xml");
        service = (DPlanService) context.getBean("dPlanService");
    }

    public static void main(String[] args) {
        MessengerVo vo = new MessengerVo();
        vo.setInfo("id","1");
        service.queryPlan(vo);
    }
}
