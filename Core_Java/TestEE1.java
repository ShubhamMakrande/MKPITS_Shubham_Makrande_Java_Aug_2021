class Calculate
{
	private String roi;
	//getter mathod
	/*public String getName()
	{
		return name;
		}*/
	//setter method
	public void setRoi(String roi)
	{
		this.roi=roi;
		}
		public float calinterest(float pa,int nom)
		{
			float pi=pa*roi*nom;
			return pi;
			}
	}
	class TestEE1
	{
		public static void main(String[] arg)
		{
			Calculate c=new Calculate();
			c.setRoi(20);
			//System.out.println("Name="+c.getRoi());
			 float ta=c.calinterest(1000,12);
			System.out.println("total of interest="+ta);



			}


		}