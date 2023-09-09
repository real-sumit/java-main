package Statictics;
import java.util.Scanner;

class mode_no2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        int rem,max=0;
        int fre[]={0,0,0,0,0,0,0,0,0,0};
        int no[]={0,1,2,3,4,5,6,7,8,9};
        
        while(n>0)
        {
            rem=n%10;
            fre[rem]=fre[rem]+1;
            n=n/10;
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(fre[j]>fre[i])
                {
                    max=fre[i];
                    fre[i]=fre[j];
                    fre[j]=max;
                    
                    max=no[i];
                    no[i]=no[j];
                    no[j]=max;
                }
            }
        }
        System.out.println();
        
        max=fre[0];
        System.out.println("Modal Value : "+max);
        System.out.print("Mode : ");
        for(int i=0;i<10;i++)
        {
            if(fre[i]==max)
            System.out.print(no[i]+",");
        }
    }
}