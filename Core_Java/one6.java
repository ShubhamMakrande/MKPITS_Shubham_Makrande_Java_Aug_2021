class Ath13 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {

            System.out.println("A:"+getThreadGroup());
        }
    }
}
class Ath14 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("B:"+getThreadGroup());
        }
    }
}

public class one6 {
    public static void main(String[] args)
    {
        Ath13 ob1=new Ath13();
        Ath14 ob2=new Ath14();
        ob1.start();
        ob2.start();
        Thread ov =Thread.currentThread();
        System.out.println(ob1);
        System.out.println(ov);
    }
}
