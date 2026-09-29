import java.io.*;
import java.util.*;
public class Waterjug{
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=gcd(a,b);
        if(c%ans==0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
