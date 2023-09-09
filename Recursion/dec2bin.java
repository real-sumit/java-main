package Recursion;

class dec2bin
{
    String x="";
    String conv(int num)
    {
        if(num==0)
        return x;
        else
        {
            x=Integer.toString(num%2)+x;
            return conv(num/2);
        }
    }
}
//it will only work for the first time 