package Pattern;
import java.util.*;

class Floyds_upright
{
    private static Scanner sc;

	public static void main(String args[])
    {
        sc = new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int x=sc.nextInt();
       
        int y=x,z=0;
       
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+z+" ");                
                y--;
                z=z+y;
            }
            y=x;
            z=0;
            System.out.println();
        }
    }
}