package Statictics;
import java.util.Scanner;

class discrete_frequented_mean
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter no of datas you want to enter : ");
        int n=sc.nextInt();
        
        int no[]=new int[n];
        int fre[]=new int[n];
        int fx=0,f=0;
        
        System.out.println("Enter nos and its frequency simultaneously : ");
        for(int i=0;i<n;i++)
        {
            no[i]=sc.nextInt();
            fre[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            fx=fx+(fre[i]*no[i]);
            f=f+fre[i];
        }
        
        double mean=fx/f;
        System.out.println("Mean of frequented data : "+mean);
    }
}