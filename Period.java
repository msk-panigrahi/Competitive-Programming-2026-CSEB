import java.io.*;
import java.util.*;

public class Period{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.length()==1){
            System.out.print(0);
            return;
        }
        int ans=0;
        int l=0,r=1;
        while(r<a.length()){
            if(a.charAt(l)!=a.charAt(r)){
                r++;
            }
            else{
                ans=r;
                break;
            }
        }
        System.out.print(ans);
    }
}
