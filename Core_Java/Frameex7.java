import java.awt.*;
class Frameex7
{
   Frameex7()
   {
      Frame lf=new Frame();
      Label l1=new Label("mkpite");
      l1.setBounds(170,60,80,30);
      lf.add(l1);

      Label l2=new Label("Signing Please");
      l2.setBounds(155,80,100,40);
      lf.add(l2);

      Label l3=new Label("Username");
      l3.setBounds(50,130,100,30);
      lf.add(l3);
      TextField t1=new TextField();
      t1.setBounds(170,130,200,25);
      lf.add(t1);

      Label l4=new Label("Password");
      l4.setBounds(50,165,100,30);
      lf.add(l4);
      TextField t2=new TextField();
      t2.setBounds(170,165,200,25);
      lf.add(t2);

      Button b1=new Button("Login");
      b1.setBounds(155,200,100,30);
      lf.add(b1);

      lf.setTitle("mkpiteSolution");
      lf.setLayout(null);

          lf.setSize(400,400);
          lf.setVisible(true);
   }
   public static void main(String[] arg)
   {
      Frameex7 fx=new Frameex7();




   }










}