package NumberSystem;
import java.util.Scanner;

class nBase_Decimal{
    public static void main() {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        
        System.out.print("Enter number : ");
        String val = sc.next();
        sc.close();
        int dec = 0;
        int p = 0;
        char ch;
        
        while(val.length() - 1 > 0) {
            ch = val.charAt(val.length() - 1);
            
            if(ch >= 48 || ch <= 57)
            dec = dec + (ch - 48) * (int)Math.pow(base, p);
            
            if(ch >= 65 || ch <= 90)
            dec = dec + (ch - 55) * (int)Math.pow(base, p);
            
            p++;
            val = val.substring(0, val.length()-1);
        }
        
        System.out.println("Decimal Number : " + dec);
    }
}