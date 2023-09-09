package Recursion;

class gcd
{
    int fact=1;
    int gcd=1;
    int hcf(int a,int b)
    {
        if(a%fact==0 && b%fact==0)
        {
            gcd=gcd*fact;                 
            return hcf(a/fact,b/fact);
        }
        else if(a*gcd==fact && b*gcd==fact)
         return gcd;   
        
        else
        {
            fact++;
            return hcf(a,b);
        }
    }
}