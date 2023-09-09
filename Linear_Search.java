import java.util.Scanner;

class Linear_Search {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array : ");
        int s = sc.nextInt();
        
        int ar[] = new int[s];      
        
        System.out.println("Enter elements in the array : ");
        for(int i = 0; i < s; i++)
        ar[i] = sc.nextInt();
        
        System.out.print("Enter the number u want to find : ");
        int n = sc.nextInt();
        sc.close();
        
        int c = 0;
        for(int i=0;i<s;i++) {
            if(ar[i] == n)
            c++;            
        }
        
        if(c > 0)
        System.out.println("Frequency of " + n + " in the array is : " + c);        
    }
}        