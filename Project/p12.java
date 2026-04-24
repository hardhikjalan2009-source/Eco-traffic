import java.util.*;
class p12
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number" );
       int n=sc.nextInt();
       int count=0;
       int copy=n;
       int dig;
       int rev=0;
       for(int i=1;i<n;i++)
       {
           if (copy%i==0)
           count++;
        }
        while(copy!=0)
        {
            dig=copy%10;
            rev=rev*10+dig;
            copy=copy/10;
            
        }
        if((count==2)&&(rev==n))
        System.out.println(n+"is a prime palindrome number");
        else
        System.out.println(n+"is not a prime palindrome number");
       }
    }