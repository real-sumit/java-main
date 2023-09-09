package Pattern;
import java.util.Scanner;

class spiral_decending_clockwise {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        
        int a[][]=new int[n][n];
        int k=n*n;
        n--;
        
        for(int i=0;i<=Math.ceil(n/2);i++) {
        	
            for(int j=i;j<=n-i-1;j++)
            a[i][j]=k--;
            
            if(k==0)
            break;
            
            for(int j=i;j<=n-i-1;j++)
            a[j][n-i]=k--;
            
            for(int j=n-i;j>=i+1;j--)
            a[n-i][j]=k--;
            
            for(int j=n-i;j>=i+1;j--)
            a[j][i]=k--;
            
            if(k==0)
            break;
        }
        
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=n;j++)
                System.out.print(a[i][j]+"\t");
            
            System.out.println();
        }
    }
}