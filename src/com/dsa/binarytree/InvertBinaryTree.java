package com.dsa.binarytree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        //TreeNodeUtils.preOrderTraversal(node);
        TreeNode inverted = invertTree(node);
        TreeNodeUtils.preOrderTraversal(inverted);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertTree(root.left);
        invertTree(root.right);;

        return root;
    }
}
