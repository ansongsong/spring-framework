package com.xiaoan.spring.source.code.read.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TestService.class})
@ComponentScan(basePackages = "com.xiaoan.spring.source.code.read.start")
public class MainConfig {


    @Bean
    public TestDataSource tulingDataSource() {
        return new TestDataSource();
    }


}
