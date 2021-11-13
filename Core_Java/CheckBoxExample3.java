//Java AWT Checkbox Example with ItemListener
import  java.awt.*;
import java.awt.event.*;
class CheckBoxExample3
{
   CheckBoxExample3()
   {
      Frame f=new Frame("CheckBox Example");
      final Label label=new Label();
      label.setAlignment(Label.CENTER);
      label.setSize(400,100);
      Checkbox cb1=new Checkbox("C++");
      cb1.setBounds(100,100,50,50);
      Checkbox cb2=new Checkbox("Java",true);
      cb2.setBounds(100,150,50,50);
      f.add(cb1);
      f.add(cb2);
      f.add(label);
      cb1.addItemListener(new ItemListener()
      {
       public void itemStateChanged(ItemEvent e)
       {
       label.setText("C++ Checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
       }


      });
      cb2.addItemListener(new ItemListener()
      {
        public void itemStateChanged(ItemEvent e)
        {
        label.setText("JaveCheckbox:"+(e.getStateChange()==1?"checked":"unchecked"));
        }


      });
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
   }
   public static void main(String[] arg)
   {
       new CheckBoxExample3();
   }
}



