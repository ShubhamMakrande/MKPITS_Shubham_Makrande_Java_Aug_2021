class Rth1 implements Runnable
{    Thread t;
    Rth1()
    {
        t=new Thread(this);
        t.start();

    }
    @Override
    public void run()
    {
       System.out.println("hii"+t.getName());
    }
}



public class Rone1 {
    public static void main(String[] arg)
    {
        Rth1 ob1=new Rth1();
        Rth1 ob2=new Rth1();
    }
}
