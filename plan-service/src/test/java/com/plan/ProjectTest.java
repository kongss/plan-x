package com.plan;

import com.alibaba.fastjson.JSONObject;
import com.plan.api.DProjectService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjectTest {
    static ClassPathXmlApplicationContext context;
    static DProjectService service;
    static {
        context = new ClassPathXmlApplicationContext("classpath*:/spring/applicationContext.xml");
        service = (DProjectService) context.getBean("dProjectService");
    }

    public static void main(String[] args) {
        saveProject();
    }

    static void saveProject(){
        JSONObject projectObject = new JSONObject();
        projectObject.put("name", "");
        projectObject.put("status", "");
        projectObject.put("beginTime", "");
        projectObject.put("endTime", "");
        projectObject.put("teaCode", "");
        projectObject.put("founder", "");

    }
}
