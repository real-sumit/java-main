package Recursion;

class prime
{
    int x=2;
    boolean isPrime(int n)
    {
        if(x==n)
        return true;
        else if(n%x==0)
        return false;
        else
        {
            x++;
            return isPrime(n);
        }
    }
}
//it will only work for the first time and it may work next time
