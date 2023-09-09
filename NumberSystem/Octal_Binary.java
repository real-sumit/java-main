package NumberSystem;
import java.util.Scanner;

class Octal_Binary {
	public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	
        System.out.println("Octal Number : ");
        String o = sc.next();
        sc.close();
        
        String b = "";
        char ch;
        
        for(int i = 0; i < o.length(); i++) {
            ch = o.charAt(i);
            if(ch == '0')          b = b + "000";
            else if(ch == '1')     b = b + "001";
            else if(ch == '2')     b = b + "010";
            else if(ch == '3')     b = b + "011";
            else if(ch == '4')     b = b + "100";
            else if(ch == '5')     b = b + "101";
            else if(ch == '6')     b = b + "110";
            else if(ch == '7')     b = b + "111";
        }
        
        System.out.println("Binary Number = " + b);
    }
}