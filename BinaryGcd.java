import java.io.*;
import java.util.*;

public class BinaryGcd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=1;
        while((a%2==0 || b%2==0) && (a>0 && b>0)){
            if(a%2==0){
                a/=2;
                if(b%2==0){
                    c*=2;
                }
            }
            if(b%2==0){
                b/=2;
            }
        }
        while(a!=b){
            if(a<b){
                b=(b-a)/2;
            }
            else{
                a=(a-b)/2;
            }
        }
        System.out.print(c*a);
    }
}
