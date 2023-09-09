package Series;
import java.util.Scanner;

class tribonacci_Series {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Number of terms : ");
        int n = sc.nextInt();
        sc.close();
        int a, b, c, d;
        a = 0;
        b = 0;
        c = 1;
        System.out.print(a + "," + b + "," + c + ",");

        System.out.println("\nThe Series :");
        for(int i = 1; i <= n; i++)
        {
            d = (a + b + c);       
            System.out.print("\t" + d);
            a = b;
            b = c;
            c = d;        
        }
    }
}