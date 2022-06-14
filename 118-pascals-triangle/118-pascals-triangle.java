class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> prev = null;
        
        for(int i = 0 ; i < n ; i++){
            List<Integer> cur = new ArrayList<>();
            
            for(int j = 0 ; j<= i ; j++){

                if(j == 0 || j == i){
                    cur.add(1);
                }else{
                    cur.add(prev.get(j) + prev.get(j-1));
                }
                
            }
            
            ans.add(cur);
            prev = cur;
            
        }
        
        return ans;
    }
}