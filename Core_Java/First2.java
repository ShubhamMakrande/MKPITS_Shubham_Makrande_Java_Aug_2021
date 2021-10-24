import java.awt.*;
class First2 extends Frame
{
   First2()
   {
   Frame f=new Frame();
   Button b1=new Button("click me");
   b1.setBounds(50,80,100,50);
   f.add(b1);
   f.setTitle("Mkpite Solution");
   f.setLayout(null);
   f.setSize(400,400);
   f.setVisible(true);



}
public static void main(String[] arg)
{
First2 fx=new First2();

}
}