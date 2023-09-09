package LinearAlgebra;
import java.util.Scanner;

class matrix_multiplication
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the matrix : ");
        int n=sc.nextInt();
        
        int ma[][]=new int[n][n];
        int m1[][]=new int[n][n];
        int m2[][]=new int[n][n];
        
        System.out.println("Enter numbers of first matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            m1[i][j]=sc.nextInt();
        }
        
        System.out.println("Enter numbers of second matrix : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            m2[i][j]=sc.nextInt();
        }
        sc.close();
        System.out.println("The two matrices are ::");
        for(int i=0;i<n;i++)                                        //printing matrix 1
        {
            for(int j=0;j<n;j++)
            System.out.print(m1[i][j]+"  ");
            
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)                                        //printing matrix 2
        {
            for(int k=0;k<n;k++)
            System.out.print(m2[i][k]+"  ");
            
            System.out.println();
        }
        
        for(int i=0;i<n;i++)                                        //generating multiplication matrix
        {
            for(int j=0;j<n;j++)
            {
                ma[i][j]=0;
                for(int k=0;k<n;k++)
                ma[i][j]+=m1[i][k]*m2[k][j];
            }
        }
        
        System.out.println("Product of both matrices is :");
        for(int i=0;i<n;i++)                                        //printing multiplication matrix
        {
            for(int j=0;j<n;j++)
            System.out.print(ma[i][j]+"  ");
            
            System.out.println();            
        }
    }
}