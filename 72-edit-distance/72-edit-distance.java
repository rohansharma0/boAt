class Solution {
    public int minDistance(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        
        int[][] dp = new int[n+1][m+1];
        
        for(int j = 0; j<= m ; j++) dp[0][j] = j;
        for(int i = 0; i<= n ; i++) dp[i][0] = i;
        
        
        for(int i = 1 ; i<= n ; i++){
            
            for(int j = 1 ; j<= m ; j++){
                
                if(s.charAt(i-1) == t.charAt(j-1)){
                    
                    dp[i][j] = dp[i-1][j-1];
                    
                }else{
                    
                    dp[i][j] = Math.min(Math.min(dp[i][j-1] , dp[i-1][j]) , dp[i-1][j-1]) + 1;
                    
                }
               
            }
        }
        
        
        return dp[n][m];
    }
    
    public int solve(int i , int j , String s , String t , int[][] dp){
        
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        if(s.charAt(i) == t.charAt(j)) return solve(i -1 , j-1 , s ,t , dp);
        
        return 1 + Math.min(Math.min(solve(i , j-1 , s ,t, dp) , solve(i-1 , j , s ,t , dp)) , solve(i-1 , j-1 , s ,t , dp));
        
    }
    
}