class Ath11 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {

            System.out.println("thread:"+getPriority());
        }
    }
}
class Ath12 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println("thread:"+getPriority());
        }
    }
}

public class one5 {
    public static void main(String[] args)
    {
        Ath11 ob1=new Ath11();
        Ath12 ob2=new Ath12();
        ob1.start();
        ob2.start();
        Thread ov =Thread.currentThread();
        System.out.println(ob1);
        System.out.println(ov);
    }
}
