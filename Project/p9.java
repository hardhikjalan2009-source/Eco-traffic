import java.util.*;
class p9
{ 
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of month " );
        int a=sc.nextInt();
        switch(a)
        {
            case 4:
            case 5:
            case 6:
                System.out.println("Summer seaon");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Rainy  Season");
                break;
            case 10:
            case 11:
                System.out.println("Autum season");
                break;
            case 12:
            case 1:
                System.out.println(" Spring Season");
                break;
            default:
                System.out.println("enter choice from 1 to 12");
        }
    }
}

