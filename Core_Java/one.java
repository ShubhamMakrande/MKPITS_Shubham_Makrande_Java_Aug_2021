class Ath5 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("thread:"+getName()+""+isAlive());
        }
    }
}
class Ath6 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("thread:"+getName());
        }
    }
}

public class one {
    public static void main(String[] args)
    {
        Ath5 ob1=new Ath5();
        Ath6 ob2=new Ath6();
        ob1.start();
        ob2.start();
        System.out.println(ob1);
    }
}
