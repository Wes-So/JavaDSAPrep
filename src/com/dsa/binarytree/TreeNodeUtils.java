package com.dsa.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNodeUtils {


    public static TreeNode createData(){
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20,fifteen,seven);
        TreeNode main = new TreeNode(3,new TreeNode(9),twenty);
        //3-9-20-15-7
        return main;
    }

    public static void postOrderTraversal(TreeNode node) {
        /*
            So, you would first visit all the nodes in the left subtree,
            then all the nodes in the right subtree, and finally, visit the root node.
            This traversal strategy is often used for tasks such as deleting nodes
            from a tree or evaluating arithmetic expressions represented by trees.
        */
        if(node == null){
            System.out.println("null");
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.val);
    }

    public static void inOrderTraversal(TreeNode node) {
        /*
            In simple terms, you start from the leftmost node, visit its left child,
            then the node itself, and finally its right child.
            This process continues recursively until all nodes are visited
            In-order traversal is commonly used in binary search trees (BSTs) to retrieve all nodes in sorted order.
         */
        if(node == null){
            System.out.println("null");
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.val);
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversal(TreeNode node){
        /*
            Pre-order traversal is useful for creating a copy of a tree or for constructing prefix
            expressions in expression trees.
            It's also a fundamental traversal method used in many tree-related algorithms.
         */
        if(node == null){
            System.out.println("null");
            return;
        }
        System.out.println(node.val);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void main(String[] args) {
//        TreeNode test = createData();
//        preOrderTraversal(test);

        List<Integer> nums = new ArrayList<>(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,null,1));
        TreeNode node = createData(nums);
        inOrderTraversal(node);
    }

    public static TreeNode createData(List<Integer> nums){
        TreeNode node = new TreeNode(nums.get(0));
        TreeNode temp = node;
        for (int i = 1; i < nums.size() ; i++) {
            TreeNode left = null;
            TreeNode right = null;
            if(i+1 < nums.size())
                left = nums.get(i+1) == null ? null: new TreeNode(nums.get(i+1));
            if(i+2 < nums.size())
                right = nums.get(i+2) == null ? null:new TreeNode(nums.get(i+2));
            if(temp != null){
                temp.left = left;
                temp.right = right;
            }

            if(i%2 == 0){
                temp = left;
            } else {
                temp = right;
            }
        }
        return node;
    }
}
