package com.tookbra.monine.config;


import com.tookbra.monine.config.spring.configuration.ProtocolBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author tookbra
 * @date 2017/12/1
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ProtocolBeanDefinitionRegistrar.class)
public @interface EnableProtocol {

    String name() default "";


    int port();
}
