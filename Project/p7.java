import java.util.*;
class p7
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter average marks of Assessment Examination" );
       int m=sc.nextInt();
       System.out.println("Grade are");
       if(m>=80)
       System.out.println("A+");
       else if(m<80 && m>=60)
        System.out.println("A");
       else if(m<60 && m>=50)
        System.out.println("B");
        else if(m<50 && m>=40)
        System.out.println("C");
        else if(m<40)
        System.out.println("D");
        System.out.println("Average marks="+m);
   }
}