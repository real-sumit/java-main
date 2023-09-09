class Eucledean_modulus
{
    public static void main(int a,int b)
    {
        System.out.println("a:\t"+a);
        System.out.println("a:\t"+a);
        
        int r=0;
        while(a!=0 && b!=0)
        {
            r=b;
            b=a%b;
            a=r;
        }
        System.out.println("Greatest Common Divisor : "+r);
    }
}
