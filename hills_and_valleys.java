import java.util.Scanner;
//https://www.hackerrank.com/challenges/counting-valleys/problem
public class hills_and_valleys {
	
	public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("You went out for a hike");
        System.out.println("0 for Downstep and 1 for Upstep : ");
        String path = sc.next() + " ";
        sc.close();
        int hills = 0, valleys = 0, sea_level = 0;
        
        for(int i = 0; i < path.length() - 1; i++) {
        	
        	char c1 = path.charAt(i);
        	char c2 = path.charAt(i + 1);
        	
        	if(c1 == '0' && c2 == '1')
        		valleys++;
        	else if(c1 == '1' && c2 == '0')
        		hills++;
        	
        	if(c1 == '0')
        		sea_level--;
        	else if(c1 == '1')
        		sea_level++;
        }
        
        System.out.println("Number of hills : " + hills);
        System.out.println("Number of valleys : " + valleys);
        if(sea_level == 0)
        	System.out.println("You ended at sea level");
        else
        	System.out.println("Your level is :" + sea_level);
	}
}
