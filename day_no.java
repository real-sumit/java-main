import java.util.*;

public class day_no {
	int day,y,n,d0,m0;		
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	//d0 for storing date no. and m0 for storing month no.
	
	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the day number : ");
		day=sc.nextInt();
		
		System.out.print("Enter the year : ");
		y=sc.nextInt();
		
		System.out.print("Enter the corresponding number of days : ");
		n=sc.nextInt();

		sc.close();
	}
	
	//function for checking Leap Year
	 
	int isLeap() {
		if(y%4==0)
			return 29;
		else
			return 28;
	}
	 
	//function for checking day validation
	 
	boolean dayValidate(int day,int y) {
		month[2]=isLeap();
		int z=0;
		for(int x=1;x<=12;x++)
			z=z+x;
		
		if(day>=1 || day<=z || y>=1000 || y<=9999)
			return true;
		else
			return false;
	}
	 
	//function for converting day no. to date and month
	 
	void day2date(int day) {
		month[2]=isLeap();
		int i=0;
		while(day>month[i]) {
			day=day-month[i];
			i++;
		}
		d0=day;
		m0=i;
	}
	
	//function for converting initial date to new date
	
	void newDate() {
		if(d0+n > month[m0]) {
			n=n-month[m0]+d0;
			
			while(n>=month[m0]) {
				n=n-month[m0];
				m0++;
				if(m0==13) {
					y++;
					m0=1;
				}
			}
			d0=n;
		}
		else
			d0=d0+n;
	}
	
	public static void main(String args[]) {
		day_no ob=new day_no();
		
		ob.input();
		String mn[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		if(ob.dayValidate(ob.day,ob.y)) {
			ob.day2date(ob.day);
			System.out.println(ob.d0+"th "+mn[ob.m0]+" "+ob.y);
			
			System.out.println("Date after "+ob.n+" days");
			
			ob.newDate();
			System.out.println(ob.d0+"th "+mn[ob.m0]+" "+ob.y);
		}
		else
			System.out.println("Enter valid date");
	}
}
