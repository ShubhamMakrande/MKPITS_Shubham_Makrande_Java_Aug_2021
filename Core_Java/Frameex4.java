import java.awt.*;
class Frameex4
{
  Frameex4()
  {
	  Frame f=new Frame();
    Button b1=new Button("Venky");
    b1.setBounds(50,50,200,100);
   f.setTitle("mkipte solution");
    f.setLayout(null);
    f.add(b1);
        f.setSize(400,400);
        f.setVisible(true);
  }
  public static void main(String[] arg)
  {
   Frameex4 fr=new Frameex4();

  }





}