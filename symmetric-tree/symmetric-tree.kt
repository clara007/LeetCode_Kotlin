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
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root == null)
            return true
        return dfs(root.left, root.right) 
    }
    fun dfs(root1: TreeNode?, root2: TreeNode?): Boolean{
        if(root1 == null && root2 == null)
            return true
        if(root1 == null || root2 == null)
            return false
        if(root1.`val` == root2.`val`)
            return dfs(root1.left, root2.right) && dfs(root1.right, root2.left)
        return false
    }
}