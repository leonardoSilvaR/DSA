package com.algorithms.trees;

import com.data.structure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeHeight {


    /**
     * Finding tree height using DFS preorder.
     * Time complexity O(n)
     * Space complexity O(1)
     *
     * @param root Binary tree
     * @return If tree is null or just a single node = 0, otherwise tree height is given.
     */
    public int height(TreeNode root) {
        if (root == null) return 0;

        int height = 0;

        TreeNode current = root;
        while (current != null) {

            if (current.getLeft() != null) {
                current = current.getLeft();
                height++;
            } else if (current.getRight() != null) {
                current = current.getRight();
                height++;
            } else {
                current = null;
            }
        }

        return height;
    }

    public static void main(String[] args) {
        TreeNode case1 = TreeHeight.treeCase1();
        TreeNode case2 = TreeHeight.treeCase2();
        TreeNode case3 = TreeHeight.treeCase3();

        TreeHeight height = new TreeHeight();
        System.out.println(height.height(case1));
        System.out.println(height.height(case2));
        System.out.println(height.height(case3));
    }


    //    1
    //  2   6
    // 3
    //   4
    // Expected height = 3
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
    // Expected height = 2
    public static TreeNode treeCase2() {
        TreeNode root = new TreeNode(1);
        TreeNode rightChild = new TreeNode(6);
        TreeNode rightChild1 = new TreeNode(4);

        root.setRight(rightChild);
        rightChild.setRight(rightChild1);

        return root;
    }

    //    1
    //      6
    //        4
    //      5
    //         10
    // Expected height = 4
    public static TreeNode treeCase3() {
        TreeNode root = new TreeNode(1);
        TreeNode rightChild = new TreeNode(6);
        TreeNode rightChild1 = new TreeNode(4);
        TreeNode leftChild = new TreeNode(5);
        TreeNode rightChild2 = new TreeNode(10);

        root.setRight(rightChild);
        rightChild.setRight(rightChild1);
        rightChild1.setLeft(leftChild);
        leftChild.setRight(rightChild2);

        return root;
    }
}
