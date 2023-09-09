package Number;
import java.util.Scanner;

class palindrome_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a palindrome number : ");
        int n=sc.nextInt();
        
        int n0=n,s=0;
        
        while(n>0) {
            s=s*10+n%10;
            n=n/10;
        }
        
        if(s==n0)
        System.out.println(n0+" is a palindrome number");
        else
        System.out.println(n0+" is not a palindrome number");
    }
}
