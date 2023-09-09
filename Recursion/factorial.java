package Recursion;

class factorial
{
    int fact(int n)
    {
        if(n==0)
        return 1;
        else
        return (n*fact(n-1));
    }
    public static void main(int n)
    {
        System.out.println("Number : "+n);
        
        factorial ob=new factorial();
        int f=ob.fact(n);
        
        System.out.println("Factorial of "+n+" : "+f);
    }
}