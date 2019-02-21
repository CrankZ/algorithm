/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.lang.Math;
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftMaxDepth = maxDepth( root.left );
        int rightMaxDepth = maxDepth( root.right );
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}