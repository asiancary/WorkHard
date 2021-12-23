package com.javabasics.demo;

import com.javabasics.Bean.Farmer;
import com.javabasics.Bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EmwitSpringApplicationTests {

    @Resource
    @Value("${person}")
    private Person mPerson ;

    @Autowired

    private Farmer farmer;
    @Test
    void contextLoads() {


//        Person mPerson = new Person();
//        mPerson.setName("mm****");
        System.out.print(mPerson.getName());;






    }

}
