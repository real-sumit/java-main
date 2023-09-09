import java.util.*;

class Time_Date
{
    public static void main (String args [])
    {
        int sec,min,hr,dom,mm,yr;
        
        GregorianCalendar dt = new GregorianCalendar();
        
        sec=dt.get(Calendar.SECOND);
        min=dt.get(Calendar.MINUTE);
        hr=dt.get(Calendar.HOUR);
        
        dom=dt.get(Calendar.DAY_OF_MONTH);
        mm=dt.get(Calendar.MONTH);
        yr=dt.get(Calendar.YEAR);
        
        System.out.println("Current Time = "+hr+":"+min+":"+sec);
        System.out.println("Current Date = "+dom+"/"+mm+"/"+yr);
    }
}