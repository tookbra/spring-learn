package com.tookbra.monine;

import com.tookbra.monine.config.Application;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tookbra
 * @date 2017/11/30
 * @description
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("monine.xml");
        context.start();
        Application applicationConfig = (Application)context.getBean("provider");
        System.out.printf(applicationConfig.getName());

    }
}
