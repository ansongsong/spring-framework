package com.xiaoan.spring.source.code.read.beanDefination.postProcessor;

import org.springframework.beans.factory.annotation.Value;

public class XiaoanLog {
    @Value("1")
    private int flag;

    @Override
    public String toString() {
        return "XiaoanLog{" +
                "flag=" + flag +
                '}';
    }

    public XiaoanLog() {

        System.out.println("我是XiaoanLog的构造方法");
    }



    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
