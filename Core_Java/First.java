//Simple example of AWT by inheritance
import java.awt.*;
class First extends Frame
{
  First()
  {
     Button b1=new Button("click me");
     b1.setBounds(30,100,80,30);//setting button position
     add(b1);//adding button into frame

     setSize(300,300);//frame size 300 width and 300 height
     setLayout(null);//no layout manager
     setVisible(true);//now frame will be visible ,by default nor visible
  }
  public static void main(String[] arg)
  {
   First f=new First();

  }




}