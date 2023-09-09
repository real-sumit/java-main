package Pattern;
import java.util.*;

class frame
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter size : ");
    	int n=sc.nextInt();
    	
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            System.out.print("* ");
            
            for(int k=2;k<=i;k++)
            System.out.print("  ");
            
            for(int l=2;l<=i;l++)
            System.out.print("  ");
            
            for(int m=n;m>=i;m--)
            System.out.print("* ");
            
            System.out.println();
        }
        
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            
            for(int k=n;k>i;k--)
            System.out.print("  ");
            
            for(int l=n;l>i;l--)
            System.out.print("  ");
             
            for(int m=1;m<=i;m++)
            System.out.print("* ");
            
            System.out.println();
        }
        
        sc.close();
    }
}