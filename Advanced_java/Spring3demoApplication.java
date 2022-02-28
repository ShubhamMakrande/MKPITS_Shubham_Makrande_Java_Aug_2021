package com.example.spring1demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Spring3demoApplication {

    public static void main(String[] args)
    {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp1 myob = (emp1) appcont.getBean("eob");
         myob.dis();

        Account1 aob = (Account1) appcont.getBean("aob");
        aob.trans();

    }

}
