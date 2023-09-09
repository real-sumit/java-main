import java.util.Scanner;
//https://www.hackerrank.com/challenges/magic-square-forming/problem
public class magic_square_3x3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        
		int[][] m=new int[3][3];
		
		System.out.println("Enter numbers in matrix :");
		for(int x = 0; x < 3; x++) {
			for(int y = 0;y < 3; y++) {
				m[x][y] = sc.nextInt();
			}
		}
		sc.close();
		int[][][] p = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
					   {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
					   {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, 
					   {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
					   {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, 
					   {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
					   {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}, 
					   {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};
		
		int min = 63;
		for(int i = 0; i < 8; i++) {
			int pd = 0;
			for(int x = 0; x < 3; x++) {
				for(int y = 0; y < 3; y++) {
					pd = pd + Math.abs(p[i][x][y] - m[x][y]);
				}
			}
			if(pd < min)
				min = pd;
			else				//just to identify the matrix with minimal cost
				p[i][1][1] = 0;
		}
		
		System.out.println("Minimal cost : "+min);
		//just for printing the matrix with minimal cost
		for(int i = 0; i < 8; i++) {
			if(p[i][1][1] == 5) {
				for(int x = 0; x < 3; x++) {
					for(int y = 0; y < 3; y++)
						System.out.print(p[i][x][y] + " ");
					
					System.out.println();
				}
			}
		}
    }
}