class Th3 extends Thread
{
    public void fun()
    {
        try
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("Harsh");
                Thread.sleep(1000);
            }
        }catch (InterruptedException i)
        {

        }
    }
}
class Th4
{
    public static void main(String[] args) throws InterruptedException
    {
        Th3 t=new Th3();
        t.fun();
        for(int i=0;i<=5;i++)
        {
            System.out.println("Venky");
            Thread.sleep(1000);
        }
    }
}