package Series;
import java.util.Scanner;

class Geometric_Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();
        
        System.out.print("Enter Common Ratio : ");
        int r = sc.nextInt();
        sc.close();

        double s = 0, t = 0;
        
        System.out.print("Numbers of GP :");
        for(int i = 1; i <= n; i++) {
            t = a * Math.pow(r, i - 1);
            s = s + t;
            System.out.print("\n" + t);
            t = 0;
        }
        System.out.println("\nSum of AP : " + s);
    }
}