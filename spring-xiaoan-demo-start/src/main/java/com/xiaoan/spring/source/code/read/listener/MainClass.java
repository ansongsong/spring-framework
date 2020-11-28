package com.xiaoan.spring.source.code.read.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ApplicationListener 例子
 * 事件监听器，测试
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        ctx.publishEvent(new ApplicationEvent("发布 事件") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        ctx.close();
    }
}
