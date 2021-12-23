import java.awt.*;
public class ToolkitExample6
{
  ToolkitExample6()
  {
  Frame f=new Frame();
  Image icon=Toolkit.getDefaultToolkit().getImage("D:\\1.jpg");
  f.setIconImage(icon);
  f.setSize(300,300);
  f.setVisible(true);
  f.setLayout(null);
  }
  public static void main(String[] args)
  {
   new ToolkitExample6();
  }






}