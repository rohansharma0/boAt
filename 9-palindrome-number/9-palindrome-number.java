class Solution {
    public boolean isPalindrome(int x) {
        String s = new String(x+"");
        
        int i = 0;
        int j = s.length()-1;
        
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        
        return true;
    }
}