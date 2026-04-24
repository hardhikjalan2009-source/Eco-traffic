
import java.util.*;
class p11
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter three digite number" );
       int n=sc.nextInt();
       int s=0;
       int i;
       if(100<=n && n<=999)
       {
       for(i=1;i<n;i++)
       {
           if(n%i==0)
           s+=i;
           
       }
       if(s==n)
       System.out.println(n+"is a perfect number");
       else
       System.out.println(n+"is not a perfect number");
    }
    else
    System.out.println("It is not a three digit number");
}


}
