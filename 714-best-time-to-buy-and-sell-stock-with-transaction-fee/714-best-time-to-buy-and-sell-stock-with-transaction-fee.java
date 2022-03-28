class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        
        int[] prev = new int[2];
        
        for(int i = n-1 ; i>= 0 ; i--){
            
            int[] curr = new int[2];
            for(int j = 0 ; j< 2 ; j++){
                int profit = 0;
                if(j == 1){
                    profit = Math.max(-prices[i] + prev[0] , prev[1]);
                }else{
                    profit = Math.max(prices[i] + prev[1] - fee,prev[0]);
                }

                curr[j] =  profit;
                
            }
            prev = curr;
        }
        
        return prev[1];
    }
}