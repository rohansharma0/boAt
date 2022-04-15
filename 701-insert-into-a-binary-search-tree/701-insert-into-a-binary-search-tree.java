/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode cur = root;
        TreeNode prev = null;
        
        while(cur != null){
            prev = cur;
            
            if(cur.val < val){
                cur = cur.right;
            }else{
                cur = cur.left;
            }
            
        }
        
        if(prev != null){
            if(prev.val < val){
                prev.right = new TreeNode(val);
            }else{
                prev.left = new TreeNode(val);
            }
        }else{
            return new TreeNode(val);
        }
        return root;
        
    }
}