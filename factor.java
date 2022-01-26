import java.util.*;
class factor
{
 public static void main(String args[])
 {
  int a,i,b;
  System.out.println("\n Enter the number: ");
  Scanner obj=new Scanner(System.in);
  a=obj.nextInt();
  for(i=1;i<=a;i++)
  {
   b=a%i;
   if(b==0)
    System.out.println(+i);
  }
 }
}
