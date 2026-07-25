class Solution {
    public int[] countBits(int n) {
        //from 0 to n so n+1
    int dp[]=new int[n+1];
   
    dp[0]=0;
    for(int i=1;i<=n;i++){
//check odd or even
        if(i%2==0){
//if even
            dp[i]=dp[i/2];
        }else
//if odd
        dp[i]=1+dp[i/2];
    }
    return dp;
    }
}