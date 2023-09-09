import java.util.Scanner;
/*Find the non repeating element in the array*/
class non_repeating_element {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of the array = ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of times the numbers will be repated ");
		int k = sc.nextInt();
		
		int[] no = new int[n];
		int[] bit = new int[32];
		double x = 0;
		
		System.out.println("Enter numbers in the array ");
		for(int i = 0; i < n; i++)
			no[i] = sc.nextInt();
		sc.close();

		for(int i = 0; i < n; i++) {
			int temp = no[i];
			int j = 0;
			while(temp > 0) {
				bit[j] = bit[j] + temp % 2;
				j++;
				temp /= 2;
			}
		}
		for(int i = 0; i < 32; i++)
			x = x + (bit[i] % k) * Math.pow(2, i);
		
		System.out.println("Thr number is = " + x);
	}
}
