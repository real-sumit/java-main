package Number;
import java.util.Scanner;

class toDescending_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
                
        int a=0,c=0,n0;
        
        for(int i=1;i<10;i++) {
            n0=n;
            while(n0!=0) {
                if(n0%10==i) {
                    a=a+(int)(n0%10*Math.pow(10,c));
                    c++;
                }
                n0=n0/10;
            }
        }
        
        System.out.println("Digits in descending order : "+a);
    }
}