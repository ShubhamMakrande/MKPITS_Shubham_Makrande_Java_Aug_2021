package Done;

class Dth1 extends Thread
     {
         public void run()
         {
             for(int i=0;i<=5;i++)
             {
                 System.out.println("hii"+getName()+""+isDaemon());
             }
         }

   }

public class Done1 {
    public static void main(String[] arg)
    {
        Dth1 ob=new Dth1();
        Dth1 ob1=new Dth1();
        Dth1 ob2=new Dth1();
        ob.setDaemon(true);
        ob.start();
        ob1.start();
        ob2.start();
    }
}
