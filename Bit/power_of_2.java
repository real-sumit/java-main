package Bit;
class power_of_2
{
    public static void main(int n)
    {
        int z=n&(n-1);
        
        System.out.println(z==0?"Power of two":"Not a power of two");
    }
}