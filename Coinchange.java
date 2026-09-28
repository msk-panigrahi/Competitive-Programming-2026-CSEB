import java.util.*;
public class Coinchange{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int total=sc.nextInt();
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         int[] dp=new int[total+1];
         Arrays.fill(dp,total+1);
         dp[0]=0;
         for(int i=1;i<=total;i++){
            for(int coin:arr){
                if(coin<=i){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
         }
         System.out.print(dp[total]>total?-1:dp[total]);
    }
}
