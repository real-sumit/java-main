import java.util.Scanner;

class Unique_string {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        sc.close();
        
        String st = "";
        char ch1, ch2;
        int c;
        
        for(int i = 0; i < str.length(); i++) {
            ch1 = str.charAt(i);
            c = 0;
            for(int j = 0; j < st.length(); j++) {
                ch2 = st.charAt(j);
                if(ch1 == ch2)
                c = 1;
            }
            if(c == 0)
            st = st + ch1;
        }

        if(st.compareTo(str) == 0)
        System.out.println(str + " is a unique string");
        else {
        	System.out.println(str + " is a non unique string");
        	System.out.print(st + " is your unique string");
        }
    }
}
