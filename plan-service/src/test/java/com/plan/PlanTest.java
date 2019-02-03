package com.plan;

import com.plan.service.impl.PlanServiceImpl;
import com.plan.utils.bean.MessengerVo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlanTest {
    static ClassPathXmlApplicationContext context;
    static PlanServiceImpl service;
    static {
        context = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext.xml");
        service = (PlanServiceImpl) context.getBean("planServiceImpl");
    }

    public static void main(String[] args) {
        MessengerVo vo = new MessengerVo();
        vo.setInfo("id","1");
        System.out.println(service.getPlan(vo));
    }
}
