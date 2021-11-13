import java.awt.*;
class CheckBoxExample2
{
   CheckBoxExample2()
   {
     Frame f=new Frame("Check Example2");
     Checkbox cb1=new Checkbox("music");
     cb1.setBounds(100,100,50,50);
     Checkbox cb2=new Checkbox("Cricket");
     cb2.setBounds(100,150,60,60);
     Checkbox cb3=new Checkbox("Hockey");
     cb3.setBounds(100,200,60,50);
     Checkbox cb4=new Checkbox("Dance");
     cb4.setBounds(100,250,60,60);
     f.add(cb1);
     f.add(cb2);
     f.add(cb3);
     f.add(cb4);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);
   }
   public static void main(String[] arg)
   {
     new CheckBoxExample2();
   }






}