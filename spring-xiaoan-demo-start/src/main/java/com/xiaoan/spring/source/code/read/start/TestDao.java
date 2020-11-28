package com.xiaoan.spring.source.code.read.start;

import org.springframework.stereotype.Repository;


@Repository
//@Scope(value = "prototype")
public class TestDao {

    private TestDataSource tulingDataSource;


    public TestDao(TestDataSource tulingDataSource) {
        this.tulingDataSource = tulingDataSource;
        System.out.println("本类的DataSource"+this.tulingDataSource);
    }

}
