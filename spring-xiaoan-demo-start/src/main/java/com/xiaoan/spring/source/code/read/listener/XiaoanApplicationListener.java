package com.xiaoan.spring.source.code.read.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 创建一个事件监听器
 */
@Component
public class XiaoanApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("XiaoanApplicationListener 事件 ："+event);
    }
}
