//create a class customer having custid,custname,custaddress,mobno,email.
class Customer
{
  int custId;
  String custName;
  String custAddress;
  String email;
  long mobno;

  public void insertCustomer(int cid,String cn,String cad,String ceml,long cmb)
  {


   custId=cid;
   custName=cn;
   custAddress=cad;
   email=ceml;
   mobno=cmb;
  }
 public void displayCustomer()
 {
      System.out.println("customer id="+custId);
      System.out.println("customer Name="+custName);
      System.out.println("customer Address="+custAddress);
      System.out.println("customer email="+email);
      System.out.println("customer mobno="+mobno);
 }
}

class Test3
{
  public static void main(String []arg)
  {
   Customer c1=new Customer();
   c1.insertCustomer(11,"Akash","Nagpur","akash@gmail.com",942188758L);
   c1.displayCustomer();




  }





}