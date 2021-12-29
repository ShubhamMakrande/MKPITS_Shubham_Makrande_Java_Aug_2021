//nested class
class Ath1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("thread "+i);
        }

    }
}
class Ath2 extends Thread
{
    public void run()
    {

    }
}
 class one1
{
    public static void main(String[] args)
    {
       Ath1 ob1=new Ath1();
        ob1.start();
    }
}

