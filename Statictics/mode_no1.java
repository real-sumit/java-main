package Statictics;
import java.util.Scanner;

class mode_no1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        int rem,max=0;
        int fre[]={0,0,0,0,0,0,0,0,0,0};
        
        while(n>0)
        {
            rem=n%10;
            fre[rem]=fre[rem]+1;
            n=n/10;
        }
        
        max=fre[0];
        for(int i=0;i<9;i++)
        {
            if(fre[i]>max)
            max=fre[i];
        }
        System.out.println();
        
        System.out.println("Modal Value : "+max);
        System.out.print("Mode : ");
        for(int i=0;i<10;i++)
        {
            if(fre[i]==max)
            System.out.print(i+",");
        }
    }
}