import java.util.*;
class p10
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number" );
       int a=sc.nextInt();
       System.out.println("Enter secound number"); 
       int b=sc.nextInt();
       System.out.println("Enter third number"); 
       int c=sc.nextInt();
       if(a>=b)
       {
           if (b>=c)
           System.out.println("Ascending order is"+a+","+b+","+c);
           else
           {
               if (a>=c)
               System.out.println("Ascending order is"+a+","+c+","+b);
               else
               System.out.println("Ascending order is"+c+","+a+","+b);
            }
        }
        else
        {
            if (a>=c)
            System.out.println("Ascending order is"+b+","+a+","+c);
            else
            {
                if(b>=c)
                System.out.println("Ascending order is"+b+","+c+","+a);
                else
                System.out.println("Ascending order is"+c+","+b+","+a);
            }
        }
    }
}
           
       