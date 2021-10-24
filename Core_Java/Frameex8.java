
//Assginment1


import java.awt.*;
class Frameex8
{
  Frameex8()
  {
    Frame lf=new Frame();
    Label l1=new Label("Signup form");
    l1.setBounds(155,80,100,40);
    lf.add(l1);

    Label l2=new Label("Username");
    l2.setBounds(50,130,100,30);
    lf.add(l2);
    TextField t1=new TextField();
    t1.setBounds(170,130,200,25);
    lf.add(t1);

    Label l3=new Label("Password");
    l3.setBounds(50,165,100,30);
    lf.add(l3);
    TextField t2=new TextField();
    t2.setBounds(170,165,200,25);
    lf.add(t2);

    Label l4=new Label("email");
    l4.setBounds(50,195,100,30);
    lf.add(l4);
    TextField t3=new TextField();
    t3.setBounds(170,195,200,25);
    lf.add(t3);

    Label l5=new Label("Mobile.No");
    l5.setBounds(50,200,200,90);
    lf.add(l5);
    TextField t4=new TextField();
    t4.setBounds(170,230,250,25);
    lf.add(t4);
    lf.setTitle("Mkpite Solution");
    lf.setLayout(null);

    Button b1=new Button("Ragister");
    b1.setBounds(170,290,300,35);
    lf.add(b1);

     lf.setSize(400,400);
     lf.setVisible(true);









  }
  public static void main(String[] arg)
  {
    Frameex8 fx=new Frameex8();

  }










}



