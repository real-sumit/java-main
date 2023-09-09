import java.util.Scanner;

class prime_factorization {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        int k = 0, i = 2, n0 = (int)(n / (Math.log(n) / Math.log(Math.exp(1)))) + 1;
        int f[][] = new int[n0][2];
        
        while(n != 1) {
            if(n % i == 0) {
                f[k][0] = i;
                while(n % i == 0) {
                    ++f[k][1];
                    n = n / i;
                }
                k++;
            }
            i++;
        }
        
        System.out.println("Factor" + "\t" + "Frequency");
        for(i = 0; i < n0; i++)
        	if(f[i][0] != 0)
        		System.out.println(f[i][0] + "\t" + f[i][1]);
	}
}