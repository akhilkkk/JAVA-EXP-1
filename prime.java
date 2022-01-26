import java.util.*;
class prime
{
 public static void main(String args[])
 {
  int a,i,b=0;
  System.out.println("Enter a number:");
  Scanner obj=new Scanner(System.in);
  a=obj.nextInt();
  for(i=2;i<=a/2;i++)
  {
   if(a%i==0)
   {
    b++;
   }
  }
   if(b==0)
   System.out.println("Prime number");
   else
   System.out.println("Not Prime number");
 }
}
