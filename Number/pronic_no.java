package Number;
import java.util.Scanner;

class pronic_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a pronic number : ");
        int n=sc.nextInt();
        
        int i=1,p=0;
        while(p<=n) {
            p=i*(i+1);
            if(p==n) {
                System.out.println(n+" is a pronic number");
                break;
            }
            else if(p>n) {
                System.out.println(n+" is not a pronic number");
                break;
            }
            else
            	i++;
        }
    }
}