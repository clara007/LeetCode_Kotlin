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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var list:MutableList<Int> = ArrayList();
        
        inorder(root, list)

        return list;        
    }
    fun inorder(root: TreeNode?, list: MutableList<Int>){
        if(root == null)
            return
        inorder(root.left, list)
        list.add(root.`val`)
        inorder(root.right, list)
    }
}