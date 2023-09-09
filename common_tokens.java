import java.util.*;
//this problem came in computer practical class 12 in 2021 where many failed to write correct code
public class common_tokens {
	String st1,st2;
	String t1[],t2[],cw[];
	int x1,x2;
	int f1[],f2[],cwf[];
	
	void token2Array(String s,int x, String st[], int freq[]) {
		StringTokenizer str=new StringTokenizer(s," ");
		
		x=str.countTokens();
		st=new String[x];
		freq=new int[x];
		int k=0;
		String p;
		
		while(str.hasMoreTokens()) {
			p=str.nextToken();
			for(int j=0;j<=k;j++) {
				if(k==j) {
					freq[k]++;
					st[k]=p;
					k++;
					break;
				}
				else if(p.compareTo(st[j])==0) {
					freq[j]++;
					break;
				}
				else
					continue;
			}
		}
	}
	
	void commonElements() {
		cw=new String[x1];
		cwf=new int[x1];
		int k=0;
		
		for(int i=0;i<x1;i++) {
			for(int j=0;j<x2;j++) {
				if(t1[i].compareTo(t2[j])==0) {
					cw[k]=t1[i];
					cwf[k]=f1[i]+f2[j];
					k++;
				}
			}
		}
	}
	
	void print() {
		for(int i=0;i<x1;i++)
			System.out.println(cw[i]+"\t"+cwf[i]);
	}
	
	public static void main(String args[]) {
		common_tokens ob=new common_tokens();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first sentence : ");
		String st1=sc.nextLine();
		
		System.out.println("Enter second sentence : ");
		String st2=sc.nextLine();
		sc.close();
		ob.token2Array(st1,ob.x1,ob.t1,ob.f1);
		ob.token2Array(st2,ob.x2,ob.t2,ob.f2);
		ob.commonElements();
		ob.print();
	}
}
