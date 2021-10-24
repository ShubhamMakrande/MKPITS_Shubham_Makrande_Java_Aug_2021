//The setBounds(int xaxis, int yaxis, int width, int height) method is used in the above example that sets the position of the awt button.
import java.awt.*;
public class FrameExmaple extends Frame
{
   FrameExample()
   {
     TextField t1=new TextField();
     t1.setBounds(10,40,80,50);
     add(t1);
    
    setTitle("Calculator");
    setLayout(null);
    
    setSize(236,300);
    setVisible(true);
   
   
   
   
   
   
   
   
   }
public static void main(String[] arg)
FrameExample f=new FrameExample();






}
