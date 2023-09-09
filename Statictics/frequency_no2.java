package Statictics;
import java.util.Scanner;

class frequency_no2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        int rem,cf=0;
        int fre[]={0,0,0,0,0,0,0,0,0,0};
        
        while(n>0)
        {
            rem=n%10;
            fre[rem]=fre[rem]+1;
            n=n/10;
        }
                        
        System.out.println("\t Frequency \t Cumulative Frequency ");
        for(int i=0;i<10;i++)
        {
            cf=cf+fre[i];
            if(fre[i]>0)
            System.out.println(i+"\t"+fre[i]+"\t\t"+cf);
        }
    }
}