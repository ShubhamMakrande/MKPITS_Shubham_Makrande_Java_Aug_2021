class Ath9 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {

            System.out.println("thread:"+getState());
        }
    }
}
class Ath10 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("thread:"+getState());
        }
    }
}

public class one4 {
    public static void main(String[] args)
    {
        Ath9 ob1=new Ath9();
        Ath9 ob2=new Ath9();
        ob1.start();
        ob2.start();
        Thread ov =Thread.currentThread();
        System.out.println(ob1);
        System.out.println(ov);
    }
}
