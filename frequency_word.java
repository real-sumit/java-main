import java.io.*;

class frequency_word {
	
    public static void main(String args[]) throws IOException {
    	
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence : ");
        String str=bb.readLine()+" ";
        
        System.out.print("Enter a word for calculating frequency : ");
        String w=bb.readLine();
        
        int f=0;        
        for(int i=0;i<(str.length()-w.length());i++) {
            String str1=str.substring(i,w.length()+i);
            if(w.compareTo(str1)==0)
            f++;
        }
        System.out.println("Frequency of ("+w+") is : "+f);
    }
}