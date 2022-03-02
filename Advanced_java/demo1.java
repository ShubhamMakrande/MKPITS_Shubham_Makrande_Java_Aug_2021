package com.example.spring4demo;

public class demo1 {
    public static void main(String[] args)
    {
        sindemo ob1=sindemo.getObj();
        sindemo ob2=sindemo.getObj();
        if(ob1==ob2)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}
class sindemo
{
     static sindemo ob=new sindemo();
     private sindemo()
    {

    }
   static public sindemo getObj()
    {
   return ob;
    }
}
