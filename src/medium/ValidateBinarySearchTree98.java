package medium;

import javax.swing.plaf.InsetsUIResource;

public class ValidateBinarySearchTree98 {

    TreeNode prev = null;


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2,    new TreeNode(1),
                                                new TreeNode(3) );

        TreeNode root2 = new TreeNode(5,    new TreeNode(4),
                                                new TreeNode(6,
                                                    new TreeNode(3),
                                                    new TreeNode(7) ));
        ValidateBinarySearchTree98 v = new ValidateBinarySearchTree98();

        System.out.println(v.isValidBST(root2));
    }


    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;


        if (isValidBST(root.left) && (prev == null || root.val > prev.val)){
            prev = root;
            return isValidBST(root.right);

        }

        return false;

    }
/*
    public boolean isValidBST(TreeNode root) {


if (root == null) return true;  //skip
        if (root.right == null && root.left == null) return true;


        boolean left = false;
        boolean right = false;

        if (root.right == null) {
            if (root.left.val < root.val) left = isValidBST(root.left);
        }
        if (root.left == null) {
            if (root.right.val > root.val) right = isValidBST(root.right);
        }


        if (root.left != null ) {
            if (root.left.val < root.val) left = isValidBST(root.left);
            else return false;
        }

        if (root.right != null) {
            if (root.right.val > root.val) right = isValidBST(root.right);
            else return false;
        }

        return left && right;    }*/

}
