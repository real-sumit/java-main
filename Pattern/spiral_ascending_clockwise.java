package Pattern;

import java.io.*;

class spiral_ascending_clockwise {
	
	public static void main(String args[])throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size : ");
		int n=Integer.parseInt(in.readLine());
		

		int t=1,r=0,e=-1;
		int a[][]=new int[n][n];
		int l=n;
		
		while(n>0) {
			
			for(int i=1;i<=n;i++)
				a[r][++e]=t++;
			
			for(int i=1;i<=n-1;i++)
				a[++r][e]=t++;
			
			for(int i=1;i<=n-1;i++)
				a[r][--e]=t++;
			
			for(int i=1;i<=n-2;i++)
				a[--r][e]=t++;
			
			n=n-2; 
		}
		
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++)
				System.out.print(a[i][j]+" ");
			
			System.out.println();
		}
	}
}
