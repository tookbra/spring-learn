package com.tookbra.monine.config.spring.schema;

import com.tookbra.monine.config.Application;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author tookbra
 * @date 2017/11/30
 * @description
 */
public class ApplicationBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Application.class;
    }

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String version = element.getAttribute("version");

        if(!StringUtils.isEmpty(name)) {
            builder.addPropertyValue("name", name);
        }
        if(!StringUtils.isEmpty(version)) {
            builder.addPropertyValue("version", version);
        }
    }

    @Override
    protected boolean shouldGenerateId() {
        return true;
    }
}
