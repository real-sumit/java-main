class Eucledean_substraction
{
    public static void main(int x,int y)
    {
        System.out.println("x:\t"+x);
        System.out.println("y:\t"+y);
        
        int gcd=0;
        while(x!=0 && y!=0)
        {
            if(x>y)
            x=x-y;
            else
            y=y-x;
        }
        gcd=x;
        System.out.println("Greatest Common Divisor : "+gcd);
    }
}