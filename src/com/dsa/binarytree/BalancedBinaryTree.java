package com.dsa.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BalancedBinaryTree {

    public static void main(String[] args) {


        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20,fifteen,seven);
        TreeNode main = new TreeNode(3,new TreeNode(9),twenty);
        //System.out.println(isBalanced(main));
//        System.out.println(height(main.right));
//        System.out.println(height(main.left));

//        List<Integer> nodeList = new ArrayList<>();
//        traverse(main,nodeList);
//        System.out.println(nodeList);
        System.out.println(isBalanced(main));
    }

    static boolean isBalanced(TreeNode node) {
        int lh;
        int rh;

        if(node == null)
            return true;

        lh = height(node.left);
        rh = height(node.right);

        System.out.println("Height:" + lh +":" + rh);

        //if( Math.abs(lh - rh) <= 1  && isBalanced(node.left) && isBalanced(node.right))
        //    return true;

        if(isBalanced(node.right))
            return true;
        return false;
    }

    static int height(TreeNode node) {
        if(node == null)
            return 0;
        System.out.println(node.val);
        return 1 + Math.max(height(node.left), height(node.right));
    }

    static void displayNodes(TreeNode node) {
        if(node == null)
            return;

        System.out.println(node.val);
        displayNodes(node.left);
        displayNodes(node.right);
    }

    static List<Integer> traverse(TreeNode node, List<Integer> nodeList) {
        if(node == null)
            return null;

        nodeList.add(node.val);
        traverse(node.left, nodeList);
        traverse(node.right, nodeList);

        return nodeList;
    }
}
