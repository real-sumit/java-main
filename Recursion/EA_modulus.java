package Recursion;

class EA_modulus
{
    int gcd(int a ,int b)
    {
        if(b==0)
        return a;
        else
        return gcd(b,a%b);
    }
    public static void main(int a,int b)
    {
        EA_modulus ob=new EA_modulus();
        
        System.out.println("Numbers : "+a+"\t"+b);
        
        System.out.println("Greatest Common Divisor : "+ob.gcd(a,b));
    }
}