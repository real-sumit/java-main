package Number;
import java.util.Scanner;

class bouncy_no {
	
	boolean increasing(int n) {
		
		int r1,r2;
		boolean flag=false;
		
		while(n>0) {
			r1=n%10;
			r2=(n/10)%10;
			if(r2<=r1)
				flag=true;
			else {
				flag=false;
				break;
			}
			n=n/10;
		}
		return flag;
	}
	
	boolean decreasing(int n) {
		
		int r1,r2;
		boolean flag=false;
		
		while(n>0) {
			r1=n%10;
			r2=(n/10)%10;
			if(r2>=r1)
				flag=true;
			else {
				flag=false;
				break;
			}
			n=n/10;
		}
		return flag;
	}
	
	public static void main(String args[]) {
		
		bouncy_no ob=new bouncy_no();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		if(n>99) {
			if(ob.increasing(n))
				System.out.println(n+" is a increasing number");
			
			else if(ob.decreasing(n))
				System.out.println(n+" is a decreasing number");
			
			else
				System.out.println(n+" is a bouncy number");
		}
		else
			System.out.println(n+" is not a three digit number");
	}
}