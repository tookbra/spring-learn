package com.tookbra.monine.config.spring.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author tookbra
 * @date 2017/11/30
 * @description
 */
public class MonineNamespaceHandler extends NamespaceHandlerSupport {


    public void init() {
        registerBeanDefinitionParser("application", new ApplicationBeanDefinitionParser());
    }
}
