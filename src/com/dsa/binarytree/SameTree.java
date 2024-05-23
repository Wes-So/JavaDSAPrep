package com.dsa.binarytree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SameTree {
    public static void main(String[] args) {
        TreeNode treeA = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode treeB = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        System.out.println(isSameTree(treeA,treeB));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


}
