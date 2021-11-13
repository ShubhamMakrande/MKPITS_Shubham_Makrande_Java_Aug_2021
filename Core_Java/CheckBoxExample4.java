import java.awt.*;
import java.awt.event.*;
class CheckBoxExample4
{
  CheckBoxExample4()
  {
	    Frame f=new Frame("CheckBoxExample4");
	 final Label label=new Label();
	 label.setAlignment(label.CENTER);
	 label.setSize(400,100);
    Checkbox cb1=new Checkbox("java");
    cb1.setBounds(100,100,50,50);

    Checkbox cb2=new Checkbox("C++");
    cb2.setBounds(100,150,50,50);
    f.add(cb1);
    f.add(cb2);
    f.add(label);
    cb1.addItemListener(new ItemListener()
    {
		public void itemStateChanged(ItemEvent e)
		{
			label.setText("java CheckBox:"+(e.getStateChange()==1?"checked":"unchecked"));

			}


		});
		cb2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("C++ CheckBox:"+(e.getStateChange()==1?"checked":"unchecked"));

				}


			});


    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public static void main(String[] arg)
  {
  new CheckBoxExample4();


  }










}