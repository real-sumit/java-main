package Series;
import java.util.Scanner;

class fibonacci_Series {
   public static void main (String args[]) {
	   Scanner sc = new Scanner(System.in);
      System.out.println("Number of terms : ");
      int n = sc.nextInt();
      sc.close();
      int a, b, c;
      a = 0;
      b = 1;
      System.out.println("a          : " + a);
      System.out.println("b          : " + b);
       
      System.out.println("\nThe Series :");
      for(int i = 0; i <= n; i++) {
         c = a + b;
         System.out.println("\t" + c);
         a = b;
         b = c;
      }
   }
}