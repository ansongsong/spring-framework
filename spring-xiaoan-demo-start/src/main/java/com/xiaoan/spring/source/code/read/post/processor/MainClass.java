package com.xiaoan.spring.source.code.read.post.processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanFactoryPostProcessor 例子
 * 执行时机，BeanDefinition 被加载到 容器中去了，但是还没有实例化  时执行
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ctx.getBean(XiaoanLog.class));
    }
}
