package Pattern;
import java.util.*;

class bigBang
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter size : ");
       int n=sc.nextInt();
       
       System.out.println();
       
       for(int i=n;i>=1;i--)
       {
            for(int j=n;j>=i;j--)
            System.out.print(j+" ");
            
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(i+" ");
                System.out.print(i+" ");
            }
            
            if(i<n)
            for(int l=i+1;l<=n;l++)
            System.out.print(l+" ");
            
            System.out.println();
       }
       for(int i=1;i<=n-1;i++)
       {
            for(int j=n;j>=i+1;j--)
            System.out.print(j+" ");
            
            for(int k=2;k<=i+1;k++)
            {
                System.out.print((i+1)+" ");
                System.out.print((i+1)+" ");
            }
            
            if(i<n-1)
            for(int l=(2+i);l<=n;l++)
            System.out.print(l+" ");
            
            System.out.println();
       }
       
       sc.close();
   }
}