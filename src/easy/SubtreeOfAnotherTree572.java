package easy;

public class SubtreeOfAnotherTree572 {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));


        SubtreeOfAnotherTree572 subtree = new SubtreeOfAnotherTree572();
        subtree.isSubtree(root, subRoot);

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return subRoot == null;
        if (subRoot == null) return false;

        if (root.val == subRoot.val) {
            System.out.println("hey");
            return isSubtree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        }


        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
