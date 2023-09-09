package Number;
import java.util.*;

class multipleHarshad_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a multiple harshad number : ");
        int n=sc.nextInt();
        
        int n0,sum;
        
        while(n>=10) {
        	n0=n;
            sum=0;
            while(n0>0) {
                sum=sum+n0%10;
                n0=n0/10;
            }
            if(n%sum==0)
                n=(int)(n/sum);
            else {
            	System.out.println(n+" is not a Multiple Harshad_no.");
                break;
            }
        }
        
        if(n<10)
        System.out.println(n+" is a Multiple Harshad_no.");
    }
}