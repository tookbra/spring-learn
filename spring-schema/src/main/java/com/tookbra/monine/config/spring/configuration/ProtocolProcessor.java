package com.tookbra.monine.config.spring.configuration;

import com.tookbra.monine.config.Protocol;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Objects;

/**
 * @author tookbra
 * @date 2017/12/1
 * @description
 */
public class ProtocolProcessor implements BeanFactoryPostProcessor, EnvironmentAware {

    private ConfigurableEnvironment environment;



    private Protocol protocol;

    /**
     * 容器初始化前调用
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if(Objects.isNull(protocol)) {
            return;
        }
        System.out.println("============>>"+ protocol.getName());
        System.out.println("============>>"+ protocol.getPort());
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = (ConfigurableEnvironment)environment;
    }


    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }


}
