import java.io.*;
import java.util.*;
public class Border{
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String ans="";
        for(int i=0;i<a.length()-1;i++)
         {
            String pre=a.substring(0,i+1);
             String suf=a.substring(a.length()-i-1);
             if(pre.equals(suf)){
                 ans=suf;
             }
         }
         System.out.print(ans);
    }
}
