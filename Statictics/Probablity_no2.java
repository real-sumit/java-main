package Statictics;
import java.util.Scanner;

class Probablity_no2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        int rem,l=0;
        int fre[]={0,0,0,0,0,0,0,0,0,0};
        
        while(n>0)
        {
            rem=n%10;
            fre[rem]=fre[rem]+1;
            l++;
            n=n/10;
        }
                        
        System.out.println("Probablity ");
        for(int i=0;i<10;i++)
        {
            if(fre[i]>0)
            System.out.println(fre[i]+"/"+l);
        }
    }
}