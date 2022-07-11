package medium;
/*
https://leetcode.com/problems/binary-tree-level-order-traversal/
* */

import org.w3c.dom.CDATASection;

import javax.swing.*;
import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3,
                new TreeNode(9,
                        null,
                        null),
                new TreeNode(20,
                        new TreeNode(15, null, null),
                        new TreeNode(7, null, null)));

        BinaryTreeLevelOrderTraversal102 b = new BinaryTreeLevelOrderTraversal102();

        b.levelOrder(node);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size()!=0) {
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                if (current.left!=null) {
                    queue.add(current.left);
                }
                if (current.right!=null) {
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
        }

        return result;

    }

/*
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> array = new ArrayList<>();
        List<Integer> basicArray = new ArrayList<>();

        basicArray.add(root.val);
        array.add(basicArray);
        levelOrder(root.left, root.right, 1, array);
        return array;
    }
    public List<Integer> levelOrder(TreeNode left, TreeNode right, int index, List<List<Integer>> bigArray) {

        List<Integer> leftRightArray = new ArrayList<>();
        if (left != null) {
            leftRightArray.add(left.val);
        }
        if (right != null) {
            leftRightArray.add(right.val);
        }


        if (leftRightArray.size() > 0) {
            if (bigArray.size() - 1 >= index) {
                bigArray.get(index).addAll(leftRightArray);
            } else {
                bigArray.add(leftRightArray);
            }
        }
        if (left!=null) {
            levelOrder(left.left, left.right, index + 1, bigArray);
        }
        if (right!=null){
            levelOrder(right.left, right.right, index + 1, bigArray);
        }

        return leftRightArray;
    }
*/


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}