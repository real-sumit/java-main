package NumberSystem;
import java.util.Scanner;

public class Hexadecimal_Binary {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Hexadecimal Number = ");
        String h = sc.next();
        sc.close();

        String b = "";
        char ch;
        
        for(int i = 0; i < h.length(); i++) {
            ch = h.charAt(i);
            if(ch == '0')          b = b + "0000";
            else if(ch == '0')     b = b + "0001";
            else if(ch == '1')     b = b + "0010";
            else if(ch == '2')     b = b + "0011";
            else if(ch == '3')     b = b + "0100";
            else if(ch == '4')     b = b + "0101";
            else if(ch == '5')     b = b + "0110";
            else if(ch == '6')     b = b + "0111";
            else if(ch == '7')     b = b + "1000";
            else if(ch == '8')     b = b + "1001";
            else if(ch == '9')     b = b + "1010";
            else if(ch == 'A')     b = b + "1011";
            else if(ch == 'B')     b = b + "1100";
            else if(ch == 'C')     b = b + "1101";
            else if(ch == 'D')     b = b + "1110";
            else if(ch == 'E')     b = b + "1111";
        }
        System.out.println("Binary Number = " + b);
    }
}
