import java.awt.*;
public class ToolkitExample7
{
  ToolkitExample7()
  {
     Frame f=new Frame();
     Image icon=Toolkit.getDefaultToolkit().getImage("D:\\1.jpg");
     f.setIconImage(icon);
     f.setSize(400,400);
     f.setVisible(true);
     f.setLayout(null);
  }
  public static void main(String[] args)
  {
   new ToolkitExample7();
  }




}