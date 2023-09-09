package Pattern;
import java.util.*;

class equilateral_triangle
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter size of the triangle :");
       int m=sc.nextInt();
       
       int n=(m*2)-1;
       for(int i=1;i<=m;i++)
       {
            for(int j=1;j<=n;j++)
            {
                if(i==m)
                System.out.print("*");
                else if(i+j==m+1)
                System.out.print("*");
                else if(j==i+m-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
       }
       
       System.out.println();
       
       for(int i=1;i<=m;i++)
       {
            for(int j=1;j<=n;j++)
            {
                if(i==1)
                System.out.print("*");
                else if(i==j)
                System.out.print("*");
                else if(i+j==n+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
       }
       
       sc.close();
    }
}