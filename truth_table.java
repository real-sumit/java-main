import java.util.Scanner;

class truth_table {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter bit count = ");
    	int c = sc.nextInt();
    	sc.close();

        int ar[] = new int[c];
        int j = 0, n = 0;
      
        for(int i = 0; i < Math.pow(2, c); i++) {
            n = i;
            while(n != 0) {       
                ar[j++] = n%2;
                n = n / 2;
            }
            j = 0;
            for(int k = c - 1; k >= 0; k--)
            System.out.print(ar[k] + "  ");
        
            System.out.println();
        }
    }
}