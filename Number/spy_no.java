package Number;
import java.util.Scanner;

class spy_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        int n0=n,s=0,p=1;
        
        while(n>0) {
            s=s+(n%10);
            p=p*(n%10);
            n=n/10;
        }
        
        if(s==p)
        System.out.println(n0+" is a spy number");
        else
        System.out.println(n0+" is not a spy number");
    }
}