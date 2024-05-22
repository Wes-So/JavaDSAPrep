package com.dsa.binarytree;

public class MaximumDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        twenty.left = fifteen;
        twenty.right = seven;
        root.left = nine;
        root.right = twenty;

        System.out.println(maxDepth(root));

    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(1+ maxDepth(root.left), 1 + maxDepth(root.right));
    }

}
