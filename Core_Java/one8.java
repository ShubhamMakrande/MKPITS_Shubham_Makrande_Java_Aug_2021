class Ath17 extends Thread
{
    public void run()
    {
        for(int i=0;i<=4;i++)
        {
          if(getName().equals("Thread-5"))
          {
              System.out.println("hiii");
          }
            System.out.println("A-"+getName());
        }
    }
}


public class one8 {
    public static void main(String[] args)
    {
        Ath17 a1=new Ath17();
        Ath17 a2=new Ath17();
        Ath17 a3=new Ath17();
        Ath17 a4=new Ath17();
        a1.start();;
        a2.start();
        a3.start();
        a4.start();
        Ath17 a5=new Ath17();
        a5.start();
        Ath17 a6=new Ath17();
        a6.start();

    }
}
