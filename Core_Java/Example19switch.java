//SwitchDemo, declares an int named month whose value represents a month. The code displays the name of the month,
//based on the value of month, using the switch statement.
class Example19switch
{
  public static void main(String []arg)
  {
  int month=8;
  String monthString;
  switch(month)
  {
     case 1: monthString="January";
      break;
      case 2: monthString="feb";
      break;
      case 3: monthString="mar";
      break;
      case 4: monthString="ap";
      break;
      case 5: monthString="may";
      break;
      case 6: monthString="June";
      break;
      case 7: monthString="July";
      break;
      case 8: monthString="Aug";
      break;
      case 9: monthString="sep";
      break;
      case 10: monthString="oct";
      break;
      case 11: monthString="nov";
      break;
      case 12: monthString="dec";
      break;
      default: monthString="invalid";
      break;
      }
      System.out.println(monthString);

  }

}







