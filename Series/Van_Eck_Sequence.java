package Series;
import java.util.Scanner;

public class Van_Eck_Sequence {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. of terms : ");
        int n = sc.nextInt();
        sc.close();

        int ve[] = new int[n], c = 0;
        
        ve[0] = 0;
        System.out.print("0");
        
        for(int i = 1; i < n - 1 ;i++) {
        	for(int j = i - 1; j >= 0; j--) {
        		if(j == 0) {
        			c = 0;
        			break;
        		}
        		else if(ve[j] == ve[i]) {
        			ve[i + 1] = c + 1;
        			break;
        		}
        		else
        			c++;
        	}
        	System.out.print(" " + c);
        	c = 1;
        }
	}
}
