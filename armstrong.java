import java.util.*;
class armstrong
{
  public static void main (String args[])
  {
   int rem,res=0,num,n;
   System.out.println("Enter the number:");
   Scanner obj=new Scanner(System.in);
   n=obj.nextInt();
   num=n;
   while(num!=0)
   {
    rem=num%10;
    res=res+(rem*rem*rem);
    num=num/10;
   }
  if(res==n)
   System.out.println("Armstrong");
  else
   System.out.println("Not Armstrong");
 }
}
