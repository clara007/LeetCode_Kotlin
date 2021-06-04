/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null)
            return true
        if( Math.abs(dfs(root.left, 0) - dfs(root.right, 0) ) <= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true
        return false
    }
    fun dfs(root: TreeNode?, height: Int): Int{
        if(root == null)
            return height
        return maxOf(dfs(root.left, height+1), dfs(root.right, height+1))
    }
}