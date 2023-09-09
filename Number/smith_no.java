package Number;
import java.util.Scanner;

public class smith_no {
	
	int sum(int n) {
		int sum0=0;
		while(n>0) {
			sum0=sum0+n%10;
			n=n/10;
		}
		return sum0;
	}
	public static void main(String args[]) {
		
		smith_no ob=new smith_no();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a smith number : ");
		int n=sc.nextInt();
		
		int i=2,sum=0,n0=n;
		
		while(n>0) {
			if(n%i==0) {
				sum=sum+ob.sum(i);
				n=n/i;
			}
			else
				i++;
		}
		
		if(sum==ob.sum(n0))
			System.out.println(n0+" is a smith number");
		else
			System.out.println(n0+" is not a smith number");
	}
}
