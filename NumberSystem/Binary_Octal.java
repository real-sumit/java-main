package NumberSystem;
import java.util.Scanner;

class Binary_Octal {
	public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	
        System.out.println("Binary Number : ");
        String b = sc.next();
        sc.close();
        
        if(b.length() % 3 == 1)
        b = "00" + b;
        else if(b.length() % 3 == 2)
        b = "0" + b;
        
        String st = "", o = "";
        
        for(int i = 0; i <= b.length() - 1; i = i + 3) {
            st=b.substring(i, i + 3);
            if(st.compareTo("000") == 0)          o = o + "0";
            else if(st.compareTo("001") == 0)     o = o + "1";
            else if(st.compareTo("010") == 0)     o = o + "2";
            else if(st.compareTo("011") == 0)     o = o + "3";
            else if(st.compareTo("100") == 0)     o = o + "4";
            else if(st.compareTo("101") == 0)     o = o + "5";
            else if(st.compareTo("110") == 0)     o = o + "6";
            else if(st.compareTo("111") == 0)     o = o + "7";
        }
        
        System.out.println("Octal Number = " + o);
    }
}