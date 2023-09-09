package Statictics;
import java.util.*;

class frequency_no1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        
        int n1=n,cf=0,rem,c;
        
        System.out.println("Number \t Frequency \t Cumulative Frequency");
        for(int i=0;i<10;i++)
        {
            n1=n;
            c=0;
            while(n1>0)
            {
                rem=n1%10;
                if(rem==i)
                c++;
                n1=n1/10;
            }
            cf=cf+c;
            if(c>0)
            System.out.println(i+"\t "+c+"\t\t"+cf);
        }
    }
}