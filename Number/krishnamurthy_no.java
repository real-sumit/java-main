package Number;
import java.util.Scanner;

class krishnamurthy_no {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a krishnamurthy number : ");
        int n=sc.nextInt();
        
        int sum=0,n0=n,f,i;
        
        while(n>0) {
            f=1;i=1;
            while(i<=n%10) {
                f=f*i;
                i++;
            }           
            sum=sum+f;
            n=n/10;
        }
       
        if(n0==sum)
        	System.out.println(n0+" is a krishnamurthy number");
        else
        	System.out.println(n0+" is not a krishnamurthy number");
    }
}