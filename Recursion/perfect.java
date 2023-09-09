package Recursion;
import java.util.*;

class perfect
{
    int num;
	perfect(int nn)
	{
		num=nn;
	}
    int sof(int n)
    {
        if(n==0)
        return 0-num;
        else if(num%n==0)
        return (n+sof(n-1));
        else
        return sof(n-1);
    }
	void check(int n)
	{
		if(num==n)
		System.out.println("perfect no");
		else
		System.out.println("get out from here");
	}
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int x=sc.nextInt();
		
		perfect ob=new perfect(x);
		
		ob.check(ob.sof(ob.num));
		sc.close();
	}
}