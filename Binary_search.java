import java.util.Scanner;

class Binary_search  
{
    public static void main(String[] args)
    {
        Scanner bb=new Scanner(System.in);
        
        System.out.print("Enter the length of the array : ");
        int l=bb.nextInt();
        
        int ar[]=new int [l];
        int k=0,p=0,lb=0,ub=l-1;
        
        System.out.println("Enter the no in ascending order :");
        for(int i=0;i<l;i++)
        ar[i]=bb.nextInt();
    
        System.out.print("Enter the no to be searched : ");
        int n=bb.nextInt();
    
        while (lb<=ub)
        {
            p=(ub+lb)/2;
            
            if(ar[p]<n)
            lb=p+1;
            
            if(ar[p]>n)
            ub=p-1;
            
            if(ar[p]==n)
            {
                k=1;
                break;
            }
        }
        
        bb.close();
    
        if(k==1)
        System.out.println("The search is successful and the no is present at position "+(p+1));
        else
        System.out.println("The search is unuccessful and the no is not present");
    }
}