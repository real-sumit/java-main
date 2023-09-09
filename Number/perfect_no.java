package Number;
import java.util.Scanner;

class perfect_no {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=sc.nextInt();
        
        int sum=0;
        
        for(int i=1;i<n;i++) {
            if(n%i==0)
            sum+=i;
        }
        
        if(n==sum)
        System.out.println(n);
	}

}
