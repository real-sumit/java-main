import java.util.Scanner;

class denomination{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of amount of notes : ");
		int x=sc.nextInt();
			
		int c[]=new int[x];
		int f[]=new int[x];
			
		System.out.println("Enter type of notes(Enter in decending order) : ");
		for(int i=0;i<x;i++){
			    c[i]=sc.nextInt();
			    f[i]=0;
		}
		sc.close();

		for(int i=0;i<x-1;i++){
			for(int j=i+1;j<x;j++){
			    if(c[j]>c[i]){
			        x=c[i];
			        c[j]=c[i];
			        c[j]=x;
			    }
			}
		}
			
		System.out.println("Enter amount to be taken : ");
		int n=sc.nextInt();
			
		for(int i=0;i<x;i++){
			while(n>=c[i]){
			    if(n>=c[i])
			    	++f[i];
			    else
			    	n=n+c[i];
			        
			    n=n-c[i];
			}
		}
			
		System.out.println("Money paid back : ");
		for(int i=0;i<x;i++){
			if(f[i]>0)
			System.out.println(f[i]+" notes of "+c[i]);
		}
    }
}