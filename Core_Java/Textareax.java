import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class Textareax
{
 Textareax()
 {
 Frame f=new Frame("Check Box Example");
   Label l=new Label();
   l.setBounds(100,200,300,20);
   f.add(l);
   Label l1=new Label();
   l1.setBounds(100,250,300,20);
   f.add(l1);
   TextField t=new TextField();
   t.setBounds(10,50,100,20);
   f.add(t);

   TextField t1=new TextField();
   t1.setBounds(10,70,100,20);
   f.add(t1);

   Checkbox cb1=new Checkbox("add:");
   cb1.setBounds(100,100,50,50);
   f.add(cb1);

   Checkbox cb2=new Checkbox("shubtraction:",true);
   cb2.setBounds(100,150,100,50);
   f.add(cb2);

   Button b1=new Button("result");
   b1.setBounds(20,300,100,30);
   f.add(b1);
  b1.addActionListener(new ActionListener()
   //@Override
   {
   public void actionPerformed(ActionEvent e)
   {
    l.setText("");
    l1.setText("");
     int n1=Integer.parseInt(t.getText());
     int n2=Integer.parseInt(t1.getText());
    int res=0;
   StringBuilder sb=new StringBuilder();
     if(cb1.getState()==true)
     {
       res=n1+n2;
       sb.append("add is:"+res);

     }

   if(cb2.getState()==true)
   {
   res=n1-n2;
   sb.append("subtraction:"+res);
   }

   l.setText(sb.toString());
   }
   });
   f.setSize(500,400);
   f.setLayout(null);
   f.setVisible(true);
 }
  public static void main(String[] arg)
  {
  Textareax ta=new Textareax();
  }







}