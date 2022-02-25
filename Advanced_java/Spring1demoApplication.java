package com.example.spring1demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring1demoApplication {

    public static void main(String[] args)
    {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp myob = (emp) appcont.getBean("myob");
         myob.dis();

        Account eob = (Account) appcont.getBean("eob");
        eob.trans();

    }

}
