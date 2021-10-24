//The setBounds(int xaxis, int yaxis, int width, int height) method is used in the above example that sets the position of the awt button.

import java.awt.*;
public class FrameExample extends Frame
{
   FrameExample()
   {
     TextField t1=new TextField();
     t1.setBounds(10,40,240,50);
     add(t1);
     Button b1=new Button("1");
     Button b2=new Button("2");
     Button b3=new Button("3");
     b1.setBounds(50,80,50,50);
     add(b1);
     b2.setBounds(100,80,50,50);
     add(b2);
     b3.setBounds(150,80,50,50);
     add(b3);
     setSize(400,300);
    setTitle("Calculator");
    setLayout(null);
    setVisible(true);

   }
public static void main(String[] arg)
{
FrameExample f=new FrameExample();



}


}
