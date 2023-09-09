package Pattern;
import java.util.*;

public class slash {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int n=sc.nextInt();
		
		System.out.print("Enter your choice : ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			for(int i=1;i<=n;i++) {
				
	            for(int j=i;j<=n;j++)
	            	System.out.print(j+" ");
	            
	            for(int k=n-1;k>=n-i+1;k--)
	            	System.out.print(k+" ");
	                        
	            System.out.println();
	        }
			break;
		case 2:
			for(int i=n;i>=1;i--) {
				
	            for(int j=i;j>=1;j--)
	            	System.out.print(j+" ");
	            
	            for(int k=2;k<=n-i+1;k++)
	            	System.out.print(k+" ");
	                        
	            System.out.println();
	        }
			break;
		case 3:
			for(int i=1;i<=n;i++) {
				
	            for(int j=n-i+1;j<=n-1;j++)
	            	System.out.print(j+" ");
	            
	            for(int k=n;k>=i;k--)
	            	System.out.print(k+" ");
	                        
	            System.out.println();
	        }
			break;
		case 4:
			for(int i=n;i>=1;i--) {
	            for(int j=n-i+1;j>=1;j--)
	            System.out.print(j+" ");
	            
	            for(int k=2;k<=i;k++)
	            System.out.print(k+" ");
	                        
	            System.out.println();
	        }
			break;
		default:
			System.out.println("No more patterns");
		}
	}
}
