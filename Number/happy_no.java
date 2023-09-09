package Number;
import java.util.*;

class happy_no {
	
    public static void main (String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        int sum=n,n0=n;
        while(sum>9) {
            n=sum;
            sum=0;
            while(n>0) {
                sum=sum+(int)Math.pow(n%10, 2);
                n=n/10;
            }
        }
        if(sum==1)
        System.out.println(n0+" is a happy_no.");
        else
        System.out.println(n0+" is a unhappy_no.");
    }
}