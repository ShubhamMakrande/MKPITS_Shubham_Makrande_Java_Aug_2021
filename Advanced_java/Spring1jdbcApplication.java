package com.example.spring1jdbc;

import com.example.spring1jdbc.dao.Studdaoimpl;
import javafx.scene.control.TextArea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring1jdbcApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

            Studdaoimpl template=ctx.getBean("stdao", Studdaoimpl.class);

           // Stud ob=new Stud();
           // ob.setId(45);
          //  ob.setName("raj");
         //   ob.setAddr("sadar");
         //   template.insert(ob);//insert method call//the parameter to take student object

       template.displaybyid(23);
    }

}
