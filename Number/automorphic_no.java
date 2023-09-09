package Number;
import java.util.Scanner;

class automorphic_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        
        int n0=n,sq=n*n;
        boolean flag=true;
        
        while(n>0) {
            if(n%10!=sq%10) {
            	flag=false;
            	break;
            }
            else {
                n=n/10;
                sq=sq/10;
                flag=true;
            }
        }
        
        if(flag==true)
        	System.out.println(n0+" is a automorphic number");
        else
        	System.out.println(n0+" is not a automorphic number");
    }    
}