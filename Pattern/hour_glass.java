package Pattern;
import java.util.*;

class hour_glass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        System.out.println();
        int i,j,k;
       
        for(i=1;i<=n;i++)
        {
           for(j=1;j<i;j++)
           System.out.print(" ");
           
           for(k=n;k>=i;k--)
           System.out.print("+ ");
           
           System.out.println();
        }
        
        for(i=1;i<=n-1;i++)
        {
           for(j=n-2;j>=i;j--)
           System.out.print(" ");
           
           for(k=0;k<=i;k++)
           System.out.print("+ ");
           
           System.out.println();
        }
    }
}

