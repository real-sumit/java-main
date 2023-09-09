package Number;
import java.util.Scanner;

class pandigital_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        
        int n0,c=0;
        for(int i=0;i<10;i++) {
            n0=n;
            while(n0>0) {
                if(n0%10==i)
                c++;
                n0=n0/10;
            }
            if(c==1)
            c=0;
            else if(c>1)
            break;
        }
        if(c==0)
        System.out.println(n+" is a pandigital number ");
        else
        System.out.println(n+" is not a pandigital number ");
    }
}