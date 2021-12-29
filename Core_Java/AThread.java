class BThread extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("harsh");
        }
    }
}
public class AThread
{
    public static void main(String[] args)
    {
        BThread t=new BThread();
        t.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("venky");
        }

    }

}
