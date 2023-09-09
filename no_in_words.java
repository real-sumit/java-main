import java.util.Scanner;

class no_in_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String ones1[] = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
        int m = n, l = 0;
        while(m > 0) {
            l++;
            m = m / 10;
        }
        
        String str = "";
        
        if(n == 0)
        str = "zero";
        
        int o = n%10;
        int t = (n/10)%10;
        if(t == 1)
        str = str + ones1[o];
        else
        str = str + tens[t] + "-" + ones[o];
        
        if(l >= 3) {
            int h = (n/100) % 10;
            if(h != 0)
            str = ones[h] + " hundred " + str;
        }
        
        if(l >= 4) {
            int th = (n / 1000) % 10;
            int tth = (n / 10000) % 10;
            if(th != 0 || tth != 0) {
                if(tth == 1)
                str = ones1[th] + " thousand " + str;
                else
                str = tens[tth] + "-" + ones[th] + " thousand " + str;
            }
        }
        
        if(l >= 6) {
            int hth = (n/100000) % 10;
            if(hth != 0)
            str = ones[hth] + " hundred " + str;
        }
        System.out.println("Number in words : "+str);
    }
}