package Done;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Dth2 extends Thread
{
    public void serviceRequest()
    {
        try
        {
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void run()
    {
        System.out.println(getName());
       serviceRequest();
       System.out.println("Thread work done");
    }

}

public class Done2
{
    public static void main(String[] arg)
    {
        Dth2 ob=new Dth2();
        Dth2 ob1=new Dth2();
        Dth2 ob2=new Dth2();
       // ob.setDaemon(true);
        ob.start();
        ob1.start();
        ob2.start();
        ExecutorService ex= Executors.newFixedThreadPool(3);
        ex.execute(ob);
        ex.execute(ob1);
        ex.execute(ob2);
        ex.shutdown();
        while(!ex.isTerminated())
        {

        }
        System.out.println("All Threads work Finished");
    }

}