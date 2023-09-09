package Number;
import java.util.Scanner;
/*  An autobiographical number is a number which describes its own description
    For e.g.    index 0123
                freq  1210 
    In the above no there are 1 zeroes 2 ones 1 twos 0 threes   */
class autobiographical_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a autobiographical number : ");
        int n = sc.nextInt();
        sc.close();

        int n1 = n, k = 0;
        int f[] = new int[10];
        
        while(n > 0) {                                                              //loop for finding length of n
            k++;
            n = n / 10;
        }
        n = n1;
        while(n > 0) {                                                              //adding +1 to index of the digits of the number
            ++f[n % 10];
            n = n / 10;
        }
        n = n1;        
        for(int i = k - 1; i > 0 && n > 0; i--, n = n / 10) {                              //checking that the frequency array is equal to the number or not
            if(f[i] != (n % 10)) {
                k = 0;
                break;
            }
        }
        
        if(k != 0)
        System.out.println(n1+" is a autobiographical number");
        else
        System.out.println(n1+" is not a autobiographical number");
    }
}