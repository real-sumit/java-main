import java.util.Scanner;

class Selection_Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array : ");
        int s = sc.nextInt();
        sc.close();

        int ar[] = new int[s];
        
        System.out.println("Enter elements in the array : ");
        for(int i = 0; i < s; i++)
        ar[i] = sc.nextInt();
        
        int swap, min;
        
        for(int i = 0; i < s - 1; i++) {
            min = i;
            for(int j = i + 1; j < s; j++) {
                if(ar[j] < ar[min])
                min = j;                   
            }
            swap = ar[i];
            ar[i] = ar[min];
            ar[min] = swap;
        }
            
        System.out.println("After arranging the elements in descending order : ");
        for(int i = 0;i < s; i++)
        System.out.print(ar[i] + "  ");
    }
}