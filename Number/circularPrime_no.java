package Number;
import java.util.*;

class circularPrime_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        
        int n0=n,l=0,div,rem,sum=0,c=0;
        
        while(n>0) {
            l++;
            n=n/10;
        }
        
        n=n0;
        while(n==n0) {
            rem=(int)(n/Math.pow(10,l-1));
            div=(int)(n%Math.pow(10,l-1));
            
            sum=div*10+rem;
            
            for(int i=1;i<=sum;i++)
            	if(sum%i==0)
            		c++;
            
            if(c==2)
            	c=0;
            else
            	break;
            
            n=sum;
            sum=0;
        }
        
        if(c==0)
        	System.out.println(n0+" is a circular prime no.");
        else
        	System.out.println(n0+" is not a circular prime no.");
    }
}