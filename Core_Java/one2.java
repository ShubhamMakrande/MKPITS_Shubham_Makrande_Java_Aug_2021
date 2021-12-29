class Ath3 extends Thread
   {
    public void run()
     {
         for(int i=0;i<=10;i++)
         {
             System.out.println("thread:"+i);
         }

         }

   }
   class Ath4 extends Thread
   {
       public void run()
       {
           for(int i=0;i<=10;i++)
           {
               System.out.println("thread:"+i);
           }

       }
   }


public class one2 {
    public static void main(String[] args)
    {
        Ath3 ob1=new Ath3();
        Ath4 ob2=new Ath4();
        ob1.start();
        ob2.start();
    }
}
