class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i< prices.length ; i++){
            if(min > prices[i]){
                min = prices[i];
            }else{
                
                if(prices[i] - min > ans){
                    
                    ans = prices[i] - min;
                }
                
            }
            
        }
        
        return ans;
        
    }
}