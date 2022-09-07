package easy;

public class ConstructStringFromBinaryTree606 {
    public String tree2str(TreeNode root) {

        if (root == null) return "";

        String right = helper(root.right);
        String left = helper(root.left);

        if (!right.isEmpty() && left.isEmpty()) left = "()";

        return new StringBuilder().append(root.val).append(left).append(right).toString();
    }


    public String helper(TreeNode root) {

        if (root == null) return "";


        String right = helper(root.right);
        String left = helper(root.left);

        if (!right.isEmpty() && left.isEmpty()) left = "()";

        return new StringBuilder().append("(").append(root.val).append(left).append(right).append(")").toString();
    }

}
