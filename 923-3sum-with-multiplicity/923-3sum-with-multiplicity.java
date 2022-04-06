class Solution {
    public int threeSumMulti(int[] arr, int target) {
        
        int mod = (int)(1e9+7);
        long ans = 0;
        
        long[] c = new long[101];
        
        for(int e : arr){
            c[e]++;
        }
        
        for(int i = 0; i<= 100 ; i++){
            for(int j = i ; j<=100 ; j++){
                
                int k = target - i - j;
                
                if(k < 0 || k > 100) continue;
                
                if(i == j && j == k){
                    
                    ans += (c[i] * (c[i] - 1) * (c[i] - 2) / 6);  
                    
                }else if(i == j && j != k){
                    
                    ans += ((c[i] * (c[i]-1) / 2) * c[k]);
                    
                }else if(i < j && j < k){
                    ans += (c[i] * c[j] * c[k]);
                }
                
            }
        }
                
        return (int)(ans % mod);
        
    }
}