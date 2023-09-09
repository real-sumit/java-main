import java.util.Scanner;

class zigzag_number {
	boolean increasing(int x) {
		int f = 0;
		while(x > 0) {
			if((x / 10) % 10 < x % 10)
				f = 1;
			else
				f = 0;
			x = x / 10;
		}
		if(f == 1)
			return true;
		else
			return false;
    }
	boolean decreasing(int x) {
		int f = 0;
		while(x > 0) {
			if((x / 10) % 10 > x % 10)
				f = 1;
			else
				f = 0;
			x = x / 10;
		}
		if(f == 1)
			return true;
		else
			return false;
    }
	public static void main(String args[]) {
		zigzag_number ob = new zigzag_number();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();

        if(ob.increasing(n) == true)
        	System.out.println(n + " is a increasing number");
        else if(ob.decreasing(n) == true)
        	System.out.println(n + " is a increasing number");
        else
        	System.out.println(n + " is a zigzag number");
	}
}
