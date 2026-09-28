import java.io.*;
import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        } 
        long target=sc.nextLong();
        int i=0;
        Arrays.sort(arr); //Sorting + three pointers i can use
        boolean found=false;
        while(i<n-2){
            int j=i+1;
            int k=n-1;
            while(j<k){
                long sum=arr[i]+arr[j]+arr[k];
                if(sum==target){
                    found=true;
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
            i++;
        }
        if(!found){
            System.out.print("No Triplet Found");
        }
    }
}
