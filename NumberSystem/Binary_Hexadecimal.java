package NumberSystem;
import java.util.Scanner;

class Binary_Hexadecimal {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Binary Number = ");
        String b = sc.next();
        sc.close();

        if(b.length() % 4 == 1)
        b = "000" + b;
        else if(b.length() % 4 == 2)
        b = "00" + b;
        else if(b.length() % 4 == 3)
        b = "0" + b;
        
        String st = "", h = "";
        
        for(int i = 0; i <= b.length() - 1; i = i + 4) {
            st = b.substring(i, i + 4);
            if(st.compareTo("0000") == 0)          h = h + "0";
            else if(st.compareTo("0001") == 0)     h = h + "1";
            else if(st.compareTo("0010") == 0)     h = h + "2";
            else if(st.compareTo("0011") == 0)     h = h + "3";
            else if(st.compareTo("0100") == 0)     h = h + "4";
            else if(st.compareTo("0101") == 0)     h = h + "5";
            else if(st.compareTo("0110") == 0)     h = h + "6";
            else if(st.compareTo("0111") == 0)     h = h + "7";
            else if(st.compareTo("1000") == 0)     h = h + "8";
            else if(st.compareTo("1001") == 0)     h = h + "9";
            else if(st.compareTo("1010") == 0)     h = h + "A";
            else if(st.compareTo("1011") == 0)     h = h + "B";
            else if(st.compareTo("1100") == 0)     h = h + "C";
            else if(st.compareTo("1101") == 0)     h = h + "D";
            else if(st.compareTo("1110") == 0)     h = h + "E";
            else if(st.compareTo("1111") == 0)     h = h + "F";
        }
        
        System.out.println("Hexadecimal Number = " + h);
    }
}