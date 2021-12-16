//A real example of Java Method Overriding
//Java method overriding example of bank
//Java method overriding is mostly used in Runtime Polymorphism which we will learn in next pages.

//Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However,
//the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
//jva Program to demostrate the real scenaio of java Method Overriding
//where three classes are overrinding the of a parent class
//Creating a Parent class
class Bank
{
 int getrateofintrest()
 {
   return 0;
 }

}
class SBI extends Bank
{
int getrateofintrest()
{
return 7;
}
}
class ICICI extends Bank
{
int getrateofintrest()
{
return 8;
}
}
class AXIS extends Bank
{
 int getrateofintrest()
 {
 return 9;
 }
}
//Test clas to create object and call the methods
class Overr2
{
  public static void main(String[] arg)
  {
    SBI s=new SBI();
    ICICI i=new ICICI();
    AXIS a=new AXIS();

    System.out.println("SBI rate of intrest"+s.getrateofintrest());
    System.out.println("ICICI rate of intrest"+i.getrateofintrest());
    System.out.println("AXIS rate of intrest"+a.getrateofintrest());





  }




}