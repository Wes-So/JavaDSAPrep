package com.dsa.binarytree;

import java.sql.SQLOutput;

public class PathSum {
    public static void main(String[] args) {
        int targetSum = 22;
        TreeNode root = createData();
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        //TreeNodeUtils.postOrderTraversal(root);
        System.out.println(hasPathSum(root,targetSum));


    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
       if(root == null) return false;
       if(root.left == null && root.right == null && root.val == targetSum) return true;

       System.out.println("Root.val:=" + root.val);
       System.out.println("Target:" + targetSum);

       return hasPathSum(root.left, targetSum - root.val) ||
       hasPathSum(root.right, targetSum - root.val);

    }

    private static int sumPath(TreeNode root, int sum){
        if(root == null) {
            return 0;
        };
        System.out.println("Value:" + root.val);
        if(root.left == null){
            sum -= root.val;
        }
        int leftSum = sumPath(root.left,sum);
        //int rightSum = sumPath(root.right,sum);
        System.out.println(leftSum);
        System.out.println(root.left == null);
        return root.val + leftSum;
    }

    private static TreeNode createData(){

            TreeNode root = new TreeNode(5);
            TreeNode node1L = new TreeNode(4);
            TreeNode node1R = new TreeNode(8);
            root.left = node1L;
            root.right = node1R;

            TreeNode node2L = new TreeNode(11, new TreeNode(7),new TreeNode(2));
            node1L.left = node2L;

            node1R.left = new TreeNode(13);
            TreeNode node2R = new TreeNode(4,null, new TreeNode(1));
            node1R.right = node2R;


            return root;

    }
}
