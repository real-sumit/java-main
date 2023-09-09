import java.util.Scanner;

class lengthwise_sort {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence : ");
        String str = sc.nextLine() + " ";
        sc.close();
        String ar[] = new String[str.length()];
        int c = 0;
        String st = "";
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != 32)
            st = st + ch;
            else {
                ar[c] = st;
                c++;
                st = "";
            }
        }
        
        for(int i = 0; i < c - 1; i++) {
            for(int j = i + 1; j < c; j++) {
                if(ar[i].length() > ar[j].length()) {
                    st = ar[i];
                    ar[i] = ar[j];
                    ar[j] = st;
                }
            }
        }
        
        for(int i = 0; i < c; i++)
        System.out.print(ar[i] + " ");
    }
}