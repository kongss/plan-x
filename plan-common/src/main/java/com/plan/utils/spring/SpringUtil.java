package com.plan.utils.spring;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class SpringUtil implements ApplicationContextAware {

    /**
     * 上下文对象实例
     */
    public static ApplicationContext applicationContext;



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public static Object getBean(String name) {
        assertContextInjected();
        return getApplicationContext().getBean(name);
    }

    /**
     * 检查ApplicationContext不为空.
     */
    private static void assertContextInjected() {
        System.out.println("applicationContext:::"+ applicationContext != null);
        Validate.validState(applicationContext != null, "applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextHolder.");
    }
}
