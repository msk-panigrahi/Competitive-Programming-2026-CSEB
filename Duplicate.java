import java.io.*;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int[] freq=new int[26];
        for(char ch:a.toCharArray()){
            freq[ch-'a']++;
        }
        boolean found=false;
        for(char ch:a.toCharArray()){
            if(freq[ch-'a']>1){
                 found=true;
                 System.out.print(ch+" ");
                 freq[ch-'a']=0;
            }
        }
        if(!found){
            System.out.print("No duplicates");
        }
    }
}
