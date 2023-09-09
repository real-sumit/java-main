package LinearAlgebra;
import java.util.Scanner;

class transpose
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        int i,j;
        System.out.print("Enter size of the matrix : ");
        int n=sc.nextInt();
        
        int x[][]=new int[n][n];
        int z[][]=new int[n][n];
        
        System.out.println("Enter no in matrix :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            z[i][j]=sc.nextInt();
        }
        sc.close();
        System.out.println();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(z[i][j]+" ");
            
            System.out.println();
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            x[j][i]=z[i][j];               
        }
        
        System.out.println("The transpose of the matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(z[i][j]+" ");
               
            System.out.println();
        }
    }
}