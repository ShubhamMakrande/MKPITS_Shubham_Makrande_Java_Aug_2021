import java.io.Serializable;
 public class StudentSerial implements Serializable
{
 int id;
 String name;
 Address address;//Has-A
public StudentSerial(int id,String name)
{
 this.id=id;
 this.name=name;
}

}

//Since Address is not Serializable, you cannot serialize the instance of the Student class.
//Note: All the objects within an object must be Serializable