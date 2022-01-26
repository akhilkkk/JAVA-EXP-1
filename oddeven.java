import java.util.*;
class oddeven
{
 public static void main(String args[])
 {
  int a,b;
  System.out.println("Enter a number:");
  Scanner obj=new Scanner(System.in);
  a=obj.nextInt();
  b=a%2;
  if(b==0)
   System.out.println("The number is even.");
  else
   System.out.println("The number is odd.");
 }
}

