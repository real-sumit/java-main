package Number;
import java.util.Scanner;
//A number is a duck no if it contains atleast a zero within it
class duck_no {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a duck number : ");
		int n=sc.nextInt();
		
		int n0=n;
		
		while(n>0) {
			if(n%10==0) {
				System.out.println(n0+" is a duck number");
				n=-1;
				break;
			}
			n=n/10;
		}
		if(n!=-1)
		System.out.println(n0+" is not a duck number");
	}
}
