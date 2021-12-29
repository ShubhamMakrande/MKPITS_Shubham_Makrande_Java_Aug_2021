public class Th1 extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 0; i <= 5; i++)
            {
                System.out.println("Harsh");
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Th2
{
    public static void main(String[] args) throws InterruptedException
    {
        Th1 t=new Th1();
        t.start();
        for(int i=0;i<=5;i++)
        {
            System.out.println("Venky");
            Thread.sleep(1000);
        }
    }
}