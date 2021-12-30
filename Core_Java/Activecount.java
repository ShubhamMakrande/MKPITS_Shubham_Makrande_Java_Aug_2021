package Done;



class ThreadNew extends Thread
{ //class constructor
   ThreadNew(String sName,ThreadGroup tgrp)
   {
       super(tgrp,sName);
       start();
   }

    public  void run()
    {
        for(int i=0;i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
public class Activecount
{
    public static void main(String [] arg)
    {
        ThreadGroup tg=new ThreadGroup("python grup");

        ThreadNew t1=new ThreadNew("first",tg);
        System.out.println("Starting the First");

        ThreadNew t2=new ThreadNew("second",tg);
        System.out.println("Starting the second");
        System.out.println("total count"+tg.activeCount());

    }
}
