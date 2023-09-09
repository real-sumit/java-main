package Number;
import java.util.*;

class prime_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        int c=0;        
        for(int i=2;i<n;i++) {
            if(n%i==0)
            c++;
        }
        
        if(c==0)
        System.out.println(n+" is a prime number");
    }
}