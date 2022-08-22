package easy;

public class PathSum112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null
                && root.right == null)
            return targetSum - root.val == 0;

        return hasPathSum(root.right, targetSum - root.val)
                || hasPathSum(root.left, targetSum - root.val);
    }


    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;

        String result = String.valueOf(root.val);

        int leftRes = sumNumbers(root.left);
        int rightRes = sumNumbers(root.right);

        return Integer.parseInt(leftRes == 0 ? result : result + leftRes)
                + Integer.parseInt(rightRes == 0 ? result : result + rightRes);



    }
}
