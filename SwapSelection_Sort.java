import java.util.Scanner;

public class SwapSelection_Sort {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	        
		System.out.print("Enter size of the array : ");
		int s=sc.nextInt();
	        
		int ar[]=new int[s];
	        
		System.out.println("Enter elements in the array : ");
		for(int i=0;i<s;i++)
			ar[i]=sc.nextInt();
	        
		for(int i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(ar[i]>ar[j])
				{
					ar[i]=ar[i]+ar[j];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
				}
			}
		}
	        
		sc.close();
	        
		System.out.println("After arranging the elements in ascending order : ");
		for(int i=0;i<s;i++)
			System.out.print(ar[i]+"  ");
	}
	
}
