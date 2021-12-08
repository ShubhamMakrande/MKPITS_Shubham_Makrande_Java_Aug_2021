class Stud
{
 void getdata(String name)//getdata method
 {
 System.out.println("Student name is:"+name);
 }
 void getdata(String name,String address)//getdata method
 {
   getdata("amit");
   System.out.println("address is:"+address);

 }

}
class Over7
{
  public static void main(String[] arg)//main method
  {
   Stud s1=new Stud();//Object create
   s1.getdata("amit","sadar");//values put


  }



}