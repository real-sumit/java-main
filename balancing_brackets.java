import java.util.Scanner;

class balancing_brackets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Brackets : ");
        String b = sc.next();
        sc.close();
        
        String b1 = b;
        char c1, c2;
        int l = 0;

        while(b.compareTo("") != 0) {
            l = b.length();
            for(int i = 0; i < b.length() - 1; i++) {
                c1 = b.charAt(i);
                c2 = b.charAt(i + 1);
                
                if(c1 == '<' && c2 == '>')
                b = b.substring(0, i) + b.substring(i + 2, b.length());
                else if(c1 == '[' && c2 == ']')
                b = b.substring(0, i) + b.substring(i + 2, b.length());
                else if(c1 == '(' && c2 == ')')
                b = b.substring(0, i) + b.substring(i + 2, b.length());
                else if(c1 == '{' && c2 == '}')
                b = b.substring(0, i) + b.substring(i + 2, b.length());
            }
            System.out.println(b);
            if(l == b.length()) {
                l = -1;
                break;
            }
        }
        if(l == -1)
        System.out.println(b1 + " is unbalanced");
        else
        System.out.println(b1 + " is balanced");
    }
}
