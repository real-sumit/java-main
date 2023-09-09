import java.util.Scanner;

class string_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of string you want to enter : ");
        int l = sc.nextInt();
        
        String st[] = new String[l];
        String ss[] = new String[l];
        String t;
        
        System.out.println("Enter the strings and the substrings simultaneously : ");
        for(int i = 0; i < l; i++) {
            st[i] = sc.next();
            ss[i] = sc.next();
            System.out.println();
        }
        sc.close();
        for(int i = 0;i < l; i++) {
            for(int j=i+1;j<l;j++) {
                if(st[i].compareTo(st[j])>0) {
                    t=st[i];
                    st[i]=st[j];
                    st[j]=t;
                       
                    t=ss[i];
                    ss[i]=ss[j];
                    ss[j]=t;
                }
            }
        }
                
        System.out.println("After sorting datas are : ");
        for(int i = 0;i < l; i++)
        System.out.println(st[i] + "\t" + ss[i]);
    }
}