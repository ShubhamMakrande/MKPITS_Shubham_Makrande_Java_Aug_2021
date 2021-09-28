//Problem Statement:
//You need to calculate the electricity bill based on the below parameters

//    Input parameters will be
 //       Usage in units
 //   The bill will be calculated as per below slab
   //     0-100 units (Rs. 3.44 per unit)
   //     101-300 units (Rs. 7.34 per unit)
   //     301-500 units (Rs. 10.36 per unit)
   //     501-1000 units (Rs. 11.82 per unit)
   //     >1000 units (Rs. 11.82 per unit)
   // Apart from the above slab, there are few fixed costs added to each bill as below
   //     Mandatory Cost: Rs. 200
   //     Vehicle Cost @ 1.38 per unit
   //     Tax @ 16% on total cost
import java.util.*;
class Bill
{
  double cost=0;
  double mandatorycost=200;
  double vehiclecost=0;
  double totalcost=0;
  double tax=0;
//calculate the unit
 void calculateBill(int unit)
 {
    if(unit<=100)
    {
      cost=unit*3.44;
    }
    else if(unit>101 && unit<=300)
    {
    cost=unit*7.34;
    }
    else if(unit>301  &&  unit<=500)
    {
       cost=unit*10.36;
    }
    else if(unit>501 && unit<=1000)
    {
      cost=unit*11.82;
    }
    else if(unit>10001)
    {
    cost=unit*11.82;
    }
    vehiclecost=1.38*unit;
    totalcost=cost+vehiclecost+mandatorycost;
    tax=totalcost*0.16;
    System.out.println("Vehicle Cost="+vehiclecost);//display the data
    System.out.println("tax 16%="+tax);
    totalcost=totalcost+tax;
    System.out.println("Electricity of total bill="+totalcost);

 }
}
///create a class to user define
class ElectricityBill
{
  public static void main(String[] arg)
  {
	  Bill b=new Bill();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter unit");
  int unit=s.nextInt();
  b.calculateBill(unit);




}

}