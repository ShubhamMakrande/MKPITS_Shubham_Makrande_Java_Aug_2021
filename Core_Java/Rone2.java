import javafx.scene.control.RadioMenuItem;

class Sycro
{
    void dis(String s)
    {
        System.out.print("["+s);
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {

        }
        System.out.print("]");
    }
}
class Sycro1 implements Runnable
    {
     Thread t;
     String sob;
     Sycro oc;
     Sycro1(Sycro oba,String s1 )
     {
         oc=oba;
         sob=s1;

        t=new Thread(this);
        t.start();
     }
     public void run()
     {
         oc.dis(sob);
       // System.out.println("h"+t.getName());
     }
   }


public class Rone2 {
    public static void main(String[] arg)
    {
        Sycro obx=new Sycro();
        Sycro1 ob=new Sycro1(obx,"Ram");
        Sycro1 ob1=new Sycro1(obx,"shyam");
        Sycro1 ob2=new Sycro1(obx,"dham");

    }
}
