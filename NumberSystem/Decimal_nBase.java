package NumberSystem;
import java.util.Scanner;

class Decimal_nBase {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Base : ");
        int b = sc.nextInt();
        
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();
        
        String d[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String st = "";
        
        while(n > 0){
            st = d[(n % b) + 1] + st;
            n = n / b;
        }
        
        System.out.print(b + "-base Number : " + st);
    }
}