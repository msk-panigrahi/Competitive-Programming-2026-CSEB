import java.io.*;
import java.util.*;

public class Threeprob {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j){
            int temp=i;
            i=j;
            j=temp;
        }
        int max=0;
        for(int k=i;k<j;k++){
            int c=1;
            int a=k;
            while(a!=1){
                if(a%2==0){
                    a/=2;
                }
                else{
                    a=3*a+1;
                }
                c++;
            }
            max=Math.max(max,c);
        }
        System.out.print(i+" "+j+" "+max);
    }
}
