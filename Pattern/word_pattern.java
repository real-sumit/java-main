package Pattern;

import java.util.Scanner;

public class word_pattern {
	
	public void pattern(String st,int n) {
		
		for(int i=1;i<=5*n;i++) {
			for(int k=0;k<st.length();k++) {
				
				if(st.charAt(k)=='A')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1 || j==4*n || i==(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='B')
					for(int j=1;j<=4*n;j++) {
						if(j==1)
							System.out.print("* ");
						else if(i==(5*n+1)/2 && j!=4*n)
							System.out.print("* ");
						else if(j==4*n && i!=1 && i!=5*n && i!=(5*n+1)/2)
							System.out.print("* ");
						else if(i==1 && j!=4*n)
							System.out.print("* ");
						else if(i==5*n && j!=4*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='C')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1 || i==5*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='D')
					for(int j=1;j<=4*n;j++) {
						if(j==1)
							System.out.print("* ");
						else if(i==1 && j!=4*n)
							System.out.print("* ");
						else if(i==5*n && j!=4*n)
							System.out.print("* ");
						else if(j==4*n && i!=1 && i!=5*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='E')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1 || i==5*n)
							System.out.print("* ");
						else if(i==(5*n+1)/2 && j<=(2*n)+1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='F')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1)
							System.out.print("* ");
						else if(i==(5*n+1)/2 && j<=(2*n)+1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='G')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1 || i==5*n)
							System.out.print("* ");
						else if(j==4*n && i>=(5*n+1)/2)
							System.out.print("* ");
						else if(i==(5*n+1)/2 && j>2*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='H')
					for(int j=1;j<=4*n;j++) {
						if(j==1 || j==4*n)
							System.out.print("* ");
						else if(i==(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='I')
					for(int j=1;j<=3*n;j++) {
						if(i==1 || i==5*n)
							System.out.print("* ");
						else if(j==(3*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='J')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==2*n+1)
							System.out.print("* ");
						else if(j<=2*n+1 && i==5*n)
							System.out.print("* ");
						else if(j==1 && i>=(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='K')
					for(int j=1;j<=4*n;j++) {
						if(j==1)
							System.out.print("* ");
						else if(i+j==(5*n)/2+3)
							System.out.print("* ");
						else if(i==j+(5*n)/2-1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				else if(st.charAt(k)=='L')
					for(int j=1;j<=4*n;j++) {
						if(i==5*n || j==1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
												
				else if(st.charAt(k)=='M')
					for(int j=1;j<=5*n;j++) {
						if(j==5*n || j==1)
							System.out.print("* ");
						else if(i==j && i<=((5*n+1)/2))
							System.out.print("* ");
						else if(i+j==(5*n+1) && i<=((5*n+1)/2))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
													
				else if(st.charAt(k)=='N')
					for(int j=1;j<=5*n;j++) {
						if(j==5*n || j==1)
							System.out.print("* ");
						else if(i==j)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
															
				else if(st.charAt(k)=='O')
					for(int j=1;j<=4*n;j++) {
						if(j==4*n || j==1)
							System.out.print("* ");
						else if(i==1 || i==5*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
														
				else if(st.charAt(k)=='P')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || j==1)
							System.out.print("* ");
						else if(i==(5*n+1)/2)
							System.out.print("* ");
						else if(j==4*n && i<=(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																
				else if(st.charAt(k)=='Q')
					for(int j=1;j<=5*n;j++) {
						if(i==1 && j!=1 && j!=5*n)
							System.out.print("* ");
						else if(j==1 && i!=1 && i!=5*n)
							System.out.print("* ");
						else if(j==5*n && i!=1)
							System.out.print("* ");
						else if(i==5*n && j!=1)
							System.out.print("* ");
						else if(i==j && i>=((5*n+1)/2))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																		
				else if(st.charAt(k)=='R')
					for(int j=1;j<=4*n;j++) {
						if(j==1 || i==1 || i==(5*n+1)/2)
							System.out.print("* ");
						else if(j==4*n && i<=(5*n+1)/2)
							System.out.print("* ");
						else if(i==j+(5*n)/2-1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																			
				else if(st.charAt(k)=='S')
					for(int j=1;j<=4*n;j++) {
						if(i==1 || i==5*n || i==(5*n+1)/2)
							System.out.print("* ");
						else if(j==1 && i<=(5*n+1)/2)
							System.out.print("* ");
						else if(j==4*n && i>=(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																				
				else if(st.charAt(k)=='T')
					for(int j=1;j<=5*n;j++) {
						if(i==1)
							System.out.print("* ");
						else if(j==(5*n+1)/2)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																					
				else if(st.charAt(k)=='U')
					for(int j=1;j<=4*n;j++) {
						if(j==1 || i==5*n || j==4*n)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																						
				else if(st.charAt(k)=='V')
					for(int j=1;j<=10*n-1;j++) {
						if(i==j || i+j==5*n*2)
							System.out.print("*");
						else
							System.out.print(" ");
					}
																							
				else if(st.charAt(k)=='W')
					for(int j=1;j<=5*n;j++) {
						if(j==5*n || j==1)
							System.out.print("* ");
						else if(i==j && i>((5*n+1)/2))
							System.out.print("* ");
						else if(i+j==(5*n+1) && i>((5*n+1)/2))
							System.out.print("* ");
						else if(n%2==1 && i==((5*n+1)/2) && j==((5*n+1)/2))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																							
				else if(st.charAt(k)=='X')
					for(int j=1;j<=5*n;j++) {
						if(i==j)
							System.out.print("* ");
						else if(i+j==5*n+1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																								
				else if(st.charAt(k)=='Y')
					for(int j=1;j<=5*n;j++) {
						if(j==(5*n+1)/2 && i>(5*n+1)/2) {
							if(n%2==1)
								System.out.print("*");
							else if(n%2==0)
								System.out.print(" *");
						}
						else if(i==j && i<=((5*n+1)/2))
							System.out.print("* ");
						else if(i+j==(5*n+1) && i<=((5*n+1)/2))
							System.out.print("* ");
						else
							System.out.print("  ");
					}
																										
				else if(st.charAt(k)=='Z')
					for(int j=1;j<=5*n;j++) {
						if(i==1 || i==5*n)
							System.out.print("* ");
						else if(i+j==5*n+1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
				
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		word_pattern ob=new word_pattern();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a word : ");
		String st=sc.next();
		
		System.out.print("Enter size : ");
		int n=sc.nextInt();
		
		ob.pattern(st,n);
	}
}