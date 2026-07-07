import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Maxascsub{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
            }
            max=Math.max(max,sum);
        }
        System.out.print(max);
    }
}
