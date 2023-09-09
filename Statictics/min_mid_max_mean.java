package Statictics;
import java.util.Scanner;

class min_mid_max_mean
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        System.out.println();
        
        int c=0,rem,sum=0,max=0,min=9,mid=0;        
        for(int i=n;i>0;i=i/10)
        {
            rem=i%10;
            sum=sum+rem;
            c++;
        }
        
        for(int i=1,j=n;i<=c;i++,j=j/10)
        {
            rem=j%10;
            
            if(max<rem)
            max=rem;
            if(min>rem)
            min=rem;
            
            if(c%2==1 && i==(c+1)/2)
            mid=rem*2;
            if(c%2==0 && (i==c/2 || i==(c/2)+1))
            mid=mid+rem;
        }
       
        System.out.println("Minimum digit in that no. : "+min);
        System.out.println("Median digit in that no. : "+(mid/2));
        System.out.println("Maximum digit in that no. : "+max);
        System.out.println("Mean of all digits : "+(sum/c));
    }
}