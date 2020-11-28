package com.xiaoan.spring.source.code.read.beanDefination.postProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinitionRegistryPostProcessor 例子
 * 时机：没有扫描BeanDefinition, BeanDefinition 还没有加载之前，可以往容器里自己加
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ctx.getBean(XiaoanLog.class));
    }
}
