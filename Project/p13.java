import java.util.*;
class p13
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter three digit number" );
       int n=sc.nextInt();
       int count=0;
       int sum=0;
       int dig;
       int copy=n;
       int x=copy;
       while(copy>0)
       {
           count++;
           copy/=10;
           
       }
       while(x>0)
       {
           dig=x%10;
           sum+=(int)Math.pow(dig,count);
           x/=10;
           count--;
        }
        if (sum==n)
        System.out.println(n+" kis a Disarium number");
        else
        System.out.println(n+" is not a Disarium number");
    }
}
       
       