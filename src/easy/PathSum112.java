package easy;

import java.util.ArrayList;
import java.util.List;

public class PathSum112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (targetSum == 0 && root.left != null && root.right != null) return false;
        if (root.left == null && root.right == null) return targetSum - root.val == 0;
        if (root.left == null) return hasPathSum(root.right, targetSum - root.right.val);
        if (root.right == null) return hasPathSum(root.left, targetSum - root.left.val);

        return hasPathSum(root.left, targetSum - root.left.val) || hasPathSum(root.right, targetSum - root.right.val);
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int i = 0, j = nums.length -1;
        while (i < j) {
            if (nums[i] == 0) {
                if (nums[j] != 0) {
                    swap(nums, i, j);
                    i++;
                    j--;
                    continue;
                }
            }
            if (nums[j] == 0) {
                j--;
                continue;
            }
            i++;
        }
    }


    public void swap(int[] nums, int a, int b) {
        int n = nums[a];


        nums[a] = nums[b];
        nums[b] = n;

    }

    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        if (root.children != null) {
            if (root.children.size() != 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    list.addAll(preorder(root.children.get(i)));
                }
            }
        }
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
