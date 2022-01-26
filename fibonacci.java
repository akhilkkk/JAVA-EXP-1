import java.util.*;
class fibonacci 
{
    public static void main(String args[])
    {
        int a1=0,a2=1,a,n,i;
        System.out.println("Enter the number:");
        Scanner def= new Scanner(System.in);
        n = def.nextInt();
        System.out.println(a1);
        System.out.println("\n"+a2);
        for(i=3;i<=n;i++)
        {
            a=a1+a2;
            System.out.println("\n"+a);
            a1=a2;
            a2=a;
        }

    }

}

