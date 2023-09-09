package Bit;
class Swapping2nos
{
    public static void main(int n,int m)
    {
        System.out.println("Before Swapping");
        System.out.println("n : "+n);
        System.out.println("m : "+m);
        
        n=n^m;
        m=n^m;
        n=n^m;
        
        System.out.println("After Swapping");
        System.out.println("n : "+n);
        System.out.println("m : "+m);
    }
}