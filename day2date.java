import java.util.*;

class day2date
{
    int day,year;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter year");   //must be within 4 digits
        year=sc.nextInt();
        
        System.out.println("Enter day");    //must be within 366 days
        day=sc.nextInt();
        
        sc.close();
    }
    void calc()
    {
        int yr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int ly[]={31,29,31,30,31,30,31,31,30,31,30,31};
        String y[]={"January","February","March","April","May","June",
           "July","August","September","October","November","December"};
        int i=0;
        if(year%4==0)
        {
            if(day<=366)
            {
                while(day>ly[i])
                {
                    day=day-ly[i];
                    i++;
                }
            }
            else
            i=-1;
        }
        else if(year%4!=0)
        {
            if(day<=366)
            {
                while(day>yr[i])
                {
                    day=day-yr[i];
                    i++;
                }
            }
            else
            i=-1;
        }
        
        if(i==-1)
        System.out.println("Enter correct day");
        else
        {
            String date=Integer.toString(day)+"th "+y[i]+" "+Integer.toString(year);
            System.out.println("The date is : "+date);
        }
    }
    public static void main(String args[])
    {
        day2date ob=new day2date();
        ob.accept();
        ob.calc();
    }
}
