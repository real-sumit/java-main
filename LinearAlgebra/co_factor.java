package LinearAlgebra;
import java.util.*;

class co_factor
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size of the matrix : ");
        int n=sc.nextInt();
        
        int m[][]=new int[n][n];
        System.out.println("Enter elements of the matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            m[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(m[i][j]+" ");
            
            System.out.println();
        }
        
        int cf[][]=new int[n-1][n-1];
        System.out.print("Enter row index : ");
        int r=sc.nextInt();
        System.out.print("Enter coloumn index : ");
        int c=sc.nextInt();
        sc.close();
        r--;
        c--;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<r && j<c)
                cf[i][j]=m[i][j];
                
                else if(i>r && j<c)
                cf[i-1][j]=m[i][j];
                
                else if(i<r && j>c)
                cf[i][j-1]=m[i][j];
                
                else if(i>r && j>c)
                cf[i-1][j-1]=m[i][j];
            }
        }
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            System.out.print(cf[i][j]+" ");
            
            System.out.println();
        }
    }
}