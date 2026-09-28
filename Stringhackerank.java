import java.io.*;
import java.util.*;
public class Stringhackerrank{
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int[] freq=new int[26];
        for(char ch:a.toCharArray()){
            freq[ch-'a']++;
        }
        int max=0;
        for(int i:freq){
            max=Math.max(max,i);
        }
        System.out.print(max);
    }
}
