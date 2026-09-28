import java.io.*;
import java.util.*;
public class Spiral{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0,bottom=n-1,left=0,right=m-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int j=top;j<=bottom;j++){
                System.out.print(arr[j][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
    }
}
