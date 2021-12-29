class Ath15 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {

            System.out.println("thread:"+getUncaughtExceptionHandler());
        }
    }
}
class Ath16 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("thread:"+getUncaughtExceptionHandler());
        }
    }
}

public class one7 {
    public static void main(String[] args)
    {
        Ath15 ob1=new Ath15();
        Ath16 ob2=new Ath16();
        ob1.start();
        ob2.start();
        Thread ov =Thread.currentThread();
        System.out.println(ob1);
        System.out.println(ov);
    }
}
