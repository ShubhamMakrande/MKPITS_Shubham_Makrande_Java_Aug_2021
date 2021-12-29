class Ath7 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println(Thread.currentThread());
            System.out.println("thread:"+getName()+""+isAlive());
        }
    }
}
class Ath8 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("thread:"+getName()+""+isAlive());
        }
    }
}

public class one3 {
    public static void main(String[] args)
    {
        Ath7 ob1=new Ath7();
        Ath8 ob2=new Ath8();
        ob1.start();
        ob2.start();
        Thread ov =Thread.currentThread();
        System.out.println(ob1);
        System.out.println(ov);
    }
}
