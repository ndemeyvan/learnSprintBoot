package com.bee_studio_mobile.app.ws.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//cette classe creait un context d'application qui
//permet d'avoir access a nimporte quel classe dans l'application

public class SpringApplicationContext implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;


    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }

    public static Object getBean(String beanName){
        return CONTEXT.getBean(beanName);
    }
}
