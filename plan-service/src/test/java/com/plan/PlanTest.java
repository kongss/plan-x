package com.plan;

import com.alibaba.fastjson.JSONObject;
import com.plan.api.DPlanService;
import com.plan.utils.bean.MessengerVo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class PlanTest {
    static ClassPathXmlApplicationContext context;
    static DPlanService service;
    static {
        context = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext.xml");
        service = (DPlanService) context.getBean("dPlanService");
    }

    public static void main(String[] args) {
        queryPlan();
        savePlan();
    }
    static  void queryPlan(){
        MessengerVo vo = new MessengerVo();
        vo.setInfo("id","1");
        service.queryPlan(vo);
    }

    static void savePlan(){
        MessengerVo vo = new MessengerVo();
        JSONObject planObject = new JSONObject();
        planObject.put("title", "1");
        planObject.put("synopsis", "2");
        planObject.put("beginTime", "3");
        planObject.put("endTime", "4");
        planObject.put("code", "5");
        planObject.put("founder", "6");

        vo.setInfo("plan", planObject);
        service.savePlan(vo);
    }

}
