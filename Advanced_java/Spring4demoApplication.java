package com.example.spring4demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Spring4demoApplication {

    public static void main(String[] args)
    {
        ApplicationContext appcont=new ClassPathXmlApplicationContext("/templates/bean.xml");
        emp3 myob = (emp3) appcont.getBean("eob1");
        myob.dis();


        emp3 myob1 = (emp3) appcont.getBean("eob1");
        myob1.dis();

        if (myob==myob1)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }



    }

}
