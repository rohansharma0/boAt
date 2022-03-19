class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        int n = s.length();
        int m = s2.length();
        
        int[][] dp = new int[n+1][m+1];
        
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= m ; j++){
                
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
        
    }
}