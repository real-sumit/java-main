package NumberSystem;
import java.io.*;

class Decimal_Hexadecimal {
	
    public static void main(String args[])throws IOException {
    	
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());

        String s="";

        //array storing the digits (as characters) in a hexadecimal number system
        char digit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(n>0){
        	s=digit[n%16]+s;
        	n=n/16;
        }
        System.out.println("Hexadecimal Number = "+s);
    }
}