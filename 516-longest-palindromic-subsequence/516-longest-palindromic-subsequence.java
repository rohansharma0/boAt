class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        
        int n = s.length();
        int m = s2.length();
        
        int[] prev = new int[m+1];
        
        for(int i = 1 ; i<= n ; i++){
            int[] curr = new int[m+1];
            for(int j = 1 ; j<= m ; j++){
                
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    curr[j] = prev[j-1]+1;
                }else{
                    curr[j] = Math.max(prev[j] , curr[j-1]);
                }
            }
            prev = curr;
        }
        
        return prev[m];
        
    }
}