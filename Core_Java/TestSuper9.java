//Let's see the real use of super keyword. Here, Emp class inherits Person class so
//all the properties of Person will be inherited to Emp by default. To initialize all the property
//, we are using parent class constructor from child class. In such way
//, we are reusing the parent class constructor.

class Person
{
 String name;
 String address;

 Person(String name,String address)
 {
   this.name=name;
   this.address=address;

 }
}
class Employee extends Person
{
float salary;

Employee(String name,String address,float salary)
{
   super(name,address);
   this.salary=salary;


}
void display()
{
 System.out.println(name+""+address+""+salary);

}
}
class TestSuper9
{
  public static void main(String[] arg)
  {
    Employee e=new Employee("harsh","sadar",1200f);
    e.display();




  }





}