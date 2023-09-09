package Series;
import java.util.Scanner;

class Arithmetic_Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();
        
        System.out.print("Enter Common Difference : ");
        int d = sc.nextInt();
        sc.close();

        int s = 0, t = 0;
        
        System.out.print("Numbers of AP :");
        for(int i = 1; i <= n; i++){
            t = a + ((i - 1) * d);
            s = s + t;
            System.out.print("\t" + t);
            t = 0;
        }
        System.out.println("\nSum of AP : " + s);
    }
}