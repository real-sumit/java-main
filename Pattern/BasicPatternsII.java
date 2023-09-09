package Pattern;

import java.util.Scanner;

public class BasicPatternsII {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size : ");
		int n=sc.nextInt();
		
		System.out.print("Enter your choice : ");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			for(int i=1;i<=n;i++) {
	            for(int j=1;j<=i;j++)
	                System.out.print(i);
	            System.out.println();
	        }
			/* for(int i=1;i<=n;i++)
	         * for(int j=i;j>=1;j--)
	         */
			break;
		case 2:
			for(int i=n;i>=1;i--) {
	            for(int j=i;j<=n;j++)
	                System.out.print(i);
	            System.out.println();
	        }
			/* for(i=n;i>=1;i--)
			 * for(j=n;j>=i;j--)
			 */
			break;
		case 3:
			for(int i=n;i>=1;i--) {
	            for(int j=1;j<=i;j++)
	                System.out.print(i);
	            System.out.println();
	        }
			/* for(i=n;i>=1;i--)
			 * for(j=i;j>=1;j--)
			 */
			break;
		case 4:
			for(int i=1;i<=n;i++) {
	            for(int j=i;j<=n;j++)
	                System.out.print(i);
	            System.out.println();
	        }
			/* for(i=1;i<=n;i++)
			 * for(j=n;j>=i;j--)
			 */
			break;
		case 5:
			for(int i=1;i<=n;i++) {
	            for(int j=1;j<=i;j++)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 6:
			for(int i=n;i>=1;i--) {
	            for(int j=n;j>=i;j--)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 7:
			for(int i=n;i>=1;i--) {
	            for(int j=1;j<=i;j++)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 8:
			for(int i=1;i<=n;i++) {
				for(int j=n;j>=i;j--)
					System.out.print(j);
				System.out.println();
			}
			break;
		case 9:
			for(int i=1;i<=n;i++) {
	            for(int j=i;j>=1;j--)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 10:
			for(int i=n;i>=1;i--) {
	            for(int j=i;j<=n;j++)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 11:
			for(int i=n;i>=1;i--) {
	            for(int j=i;j>=1;j--)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		case 12:
			for(int i=1;i<=n;i++) {
	            for(int j=i;j<=n;j++)
	                System.out.print(j);
	            System.out.println();
	        }
			break;
		default:
			System.out.println("No more patterns");
		}
	}
}
