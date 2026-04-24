import java.util.*;
class p8
 { 
   public static void main ()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of calls made " );
       int call=sc.nextInt();
       double bill=0.0;
       if(call<=100)
       bill=250.0;
       else if (call<=200 && call>100)
       bill=250.0+((call-100)*1.05);
       else if (call<=300 && call>200)
       bill=250.0+(100*1.05)+((call-200)*1.15);
       else if (call>300)
       bill=250.0+(100*1.05)+(200*1.25)+((call-200)*1.25);
       System.out.println("Total calls made="+call);
       System.out.println("Total bill made="+bill);
    }
}
       