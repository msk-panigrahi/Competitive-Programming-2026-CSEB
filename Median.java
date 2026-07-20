import java.io.*;
import java.util.*;

public class Median {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] n1=new int[m];
        int[] n2=new int[n];
        for(int i=0;i<m;i++){
            n1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            n2[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        int[] ans=new int[m+n];
        while(i<m && j<n){
            if(n1[i]<=n2[j]){
                ans[k++]=n1[i];
                i++;
            }
            else{
                ans[k++]=n2[j];
                j++;
            }
        }
        while(i<m){
            ans[k++]=n1[i];
            i++;
        }
        while(j<n){
            ans[k++]=n2[j];
            j++;
        }
        double res=0;
        int a=ans.length;
        if(a%2==1){
            System.out.print((double)ans[a/2]);
            return;
        }
        else{
            res=(double)(ans[a/2]+ans[(a/2)-1])/2;
        }
        System.out.print(res);
    }
}
