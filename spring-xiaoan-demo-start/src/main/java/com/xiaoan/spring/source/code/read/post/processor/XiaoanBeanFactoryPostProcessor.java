package com.xiaoan.spring.source.code.read.post.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 执行时机，BeanDefinition 被加载到 容器中去了，但是还没有实例化  时执行
 */
@Component
public class XiaoanBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("IOC 容器调用了XiaoanBeanFactoryPostProcessor的postProcessBeanFactory方法");
        for(String name:beanFactory.getBeanDefinitionNames()) {
            if("xiaoanLog".equals(name)) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
//                beanDefinition.setLazyInit(true);
            }

        }
    }
}
