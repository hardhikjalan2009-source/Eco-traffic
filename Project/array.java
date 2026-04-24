import java.util.*;
class array
{ 
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter number");
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(ar[i]>ar[j])
               {
                   int t=ar[i];
                   ar[i]=ar[j];
                   ar[j]=t;
               }
           }
        
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ar[i]);
        }
    }
}