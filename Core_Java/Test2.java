//create a class employee having empno,empname,designation and salary
class Employee
{
  int empNo;
  String empName;
  String empDesignation;
  double empSalary;

   public void insertEmployee(int eno,String en,String ed,double es)
   {
     empNo=eno;
     empName=en;
     empDesignation=ed;
     empSalary=es;

   }

   public void displayEmployee()
   {
     System.out.println("emp no="+empNo);
     System.out.println("emp name="+empName);
      System.out.println("emp designation="+empDesignation);
     System.out.println("emp salary="+empSalary);
    }
}

class Test2
{
  public static void main(String arg[])
   {
      Employee e1=new Employee();
      e1.insertEmployee(11,"dinesh","Manger",1200000);
      e1.displayEmployee();



   }



}