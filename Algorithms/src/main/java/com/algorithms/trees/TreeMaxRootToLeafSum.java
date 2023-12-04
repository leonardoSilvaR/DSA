package com.algorithms.trees;

import com.data.structure.tree.TreeNode;

import java.util.Stack;

public class TreeMaxRootToLeafSum {


    /**
     * Max root to leaf sum using DFS preorder.
     * Time complexity O(n)
     * Space complexity O(1)
     *
     * @param root
     * @return
     */
    public int recursiveSum(TreeNode root) {
        if (root == null) return 0;
        int max = Math.max(recursiveSum(root.getLeft()), recursiveSum(root.getRight()));
        return root.getData() + max;
    }

    public static void main(String[] args) {
        TreeMaxRootToLeafSum sum = new TreeMaxRootToLeafSum();
        System.out.println(sum.recursiveSum(treeCase1()));
        System.out.println(sum.recursiveSum(treeCase2()));
    }

    //    1
    //  2   6
    // 3
    //   4
    // Expected max sum = 10
    public static TreeNode treeCase1() {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(6);
        TreeNode leftChild1 = new TreeNode(3);
        TreeNode rightChild1 = new TreeNode(4);

        root.setLeft(leftChild);
        root.setRight(rightChild);
        leftChild.setLeft(leftChild1);
        leftChild1.setRight(rightChild1);

        return root;
    }

    //    1
    //      6
    //        4
    // Expected max sum = 11
    public static TreeNode treeCase2() {
        TreeNode root = new TreeNode(1);
        TreeNode rightChild = new TreeNode(6);
        TreeNode rightChild1 = new TreeNode(4);

        root.setRight(rightChild);
        rightChild.setRight(rightChild1);

        return root;
    }

}
