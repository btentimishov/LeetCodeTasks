package easy;


public class TreeNode {
    int val;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
