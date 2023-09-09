package Number;
import java.util.Scanner;

class neon_no {
	
    public static void main(String args []) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        
        int sq=n*n,sum=0;
        
        while(sq>0) {
            sum=sum+sq%10;
            sq=sq/10;
        }
        
        if(sum==n)
        System.out.println(n+" is a neon_no");
        else
        System.out.println(n+" is not a neon_no");
    }    
}