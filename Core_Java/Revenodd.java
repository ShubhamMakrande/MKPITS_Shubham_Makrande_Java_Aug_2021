class evenodd implements Runnable
          {

              Thread t;
              evenodd()
              {
                  t = new Thread(this);
                  t.start();

              }
              public void run()
              {  int num=10;
                  System.out.println("Enter number:"+num);

                  if(num%2==0)
                  {
                      System.out.println("Entered Number is Even");
                  }else
                  {
                      System.out.println("Entered Number is Odd");
                  }

              }
          }



public class Revenodd {
    public static void main(String[] arg)
    {
        evenodd t=new evenodd();

    }
}

