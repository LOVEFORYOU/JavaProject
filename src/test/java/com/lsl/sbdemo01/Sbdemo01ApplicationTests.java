package com.lsl.sbdemo01;

import com.lsl.sbdemo01.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbdemo01ApplicationTests {

    //@Autowired：使用的时候要自动加载，不然值会为null
    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
