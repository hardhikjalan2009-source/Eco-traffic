import java.util.*;
class array2
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
           for(int j=0;j<n-1;j++)
           {
               if(ar[j]>ar[j+1])
               {
                   int t=ar[j];
                   ar[j]=ar[j+1];
                   ar[j+1]=t;
               }
           }
        
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ar[i]);
        }
    }
}
