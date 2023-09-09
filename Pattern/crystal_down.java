package Pattern;
import java.util.Scanner;

class crystal_down
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        
    	System.out.println("Enter size : ");
    	int n=sc.nextInt();
    	
        for(int i=1;i<=n;i++) {
        	
            for(int j=2;j<=i;j++)
            System.out.print(" ");
        
            for(int k=n;k>=i;k--)
            System.out.print("* ");
         
            System.out.println();
        }
    }
}