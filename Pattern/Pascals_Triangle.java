package Pattern;
import java.util.*;

class Pascals_Triangle
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter number of rows in Pascals Triangle : ");
       int n=sc.nextInt();
       
       int p[]=new int[n+1];
       p[0]=1;
       
       for(int i=1;i<=n;i++)
       {
            for(int j=i;j<=n;j++)
            System.out.print(" ");
            
            for(int k=0;k<i;k++)
            System.out.print(p[k]+" ");
            
            System.out.println();
            
            for(int l=i;l>0;l--)
            p[l]=p[l]+p[l-1];
       }
    }
}