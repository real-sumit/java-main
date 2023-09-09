package Recursion;

class lcm
{
    int lcm=1;
    int calc(int a,int b)
    {
        if(lcm%a==0 && lcm%b==0)
        return lcm;
        
        else
        {
            lcm++;
            return calc(a,b);
        }
    }
}
