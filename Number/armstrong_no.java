package Number;
import java.util.Scanner;

class armstrong_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a armstrong number : ");
        int n=sc.nextInt();
        
        int n0=n,sum=0;
        
        while(n>0) {
            sum=sum+(int)Math.pow(n%10, 3);
            n=n/10;
        }
    
        if(sum==n)
        System.out.println(n0);
	}

}
