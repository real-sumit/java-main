package Number;
import java.util.Scanner;

class niven_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        int n0,sum=n;
        
        while(sum>9) {
            n0=sum;
            sum=0;
            while(n0>0) {
                sum=sum+n0%10;
                n0=n0/10;
            }
        }
        
        if(n%sum==0)
        System.out.println(n+" is a niven number");
        else
        System.out.println(n+" is not a niven number");
    }
}