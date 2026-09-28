import java.io.*;
import java.util.*;
public class Rotten{
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[][] arr=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int t=0,c=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            c=0;
            if(arr[i][j]==2){
                if(i-1>=0){
                    if(arr[i-1][j]==1){
                    arr[i-1][j]=2;
                    c=1;
                    }
                }
                if(i+1<m){
                    if(arr[i+1][j]==1){
                    arr[i+1][j]=2;
                    c=1;
                    }
                }
                if(j-1>=0){
                    if(arr[i][j-1]==1){
                    arr[i][j-1]=2;
                    c=1;
                    }
                }
                if(j+1<n){
                    if(arr[i][j+1]==1){
                    arr[i][j+1]=2;
                    c=1;
                    }
                }
                if(c==1){
                    t++;
                }
            }
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==1){
                System.out.print(-1);
                return;
            }
        }
    }
    System.out.print(t);
    }
}
