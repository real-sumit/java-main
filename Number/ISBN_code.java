package Number;
import java.util.*;

class ISBN_code {                 //International Standard Book Number

    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        long n=sc.nextLong();
        
        long n1=n,c=0,sum=0,k=10;
        
        while(n1>0) {
            c++;
            n1=n1/10;
        }
        
        if(c!=10) {
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        else {
            while(n>0) {
                sum=sum+(k*(n%10));
                k--;
                n=n/10;
            }
            
            if(sum%11==0)
            	System.out.println("Legal ISBN");
            else
            	System.out.println("Illegal ISBN");
        }
    }
}