package medium

class BinaryTreePruning814 {


    fun pruneTree(root: TreeNode?): TreeNode? {
        if (root == null) return null


        pruneTree(root.left).also { root.left = it }
        pruneTree(root.right).also { root.right = it }

        return if (root.left == null && root.right == null) {
            if (root.`val` == 0) return null
            root
        } else root

    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}