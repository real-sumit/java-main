package Recursion;

class armstrong {
	
    boolean amg(int n,int n1,int sum) {
        if(n<=0 && sum==n1)
        return true;
        else if(n<=0 && sum!=n1)
        return false;
        else
        return amg(n/10,n1,sum+(int)Math.pow(n%10,3));
    }
    
    public static void main(String args[]) {
        armstrong ob=new armstrong();
        
        for(int i=1;i<=1000;i++) {
            if(ob.amg(i,i,0)==true)
            System.out.println(i);
        }
    }
}