import java.util.Scanner;

class Bubble_Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int s = sc.nextInt();
        
        int ar[] = new int[s], temp = 0;
        
        System.out.println("Enter elements in the array : ");
        for(int i = 0; i < s; i++)
            ar[i] = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < s - 1; i++){
            for(int j = 0; j < s - i - 1; j++){
                if(ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j + 1] = temp;
                }
            }
        }
        
        System.out.println("After arranging the elements in ascending order : ");
        for(int i = 0; i < s; i++)
            System.out.print(ar[i] + " ");
    }
} 