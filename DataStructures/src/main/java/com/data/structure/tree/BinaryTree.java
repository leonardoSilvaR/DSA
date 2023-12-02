package com.data.structure.tree;

public class BinaryTree {


//        1
//    2       3
// 4     5       6


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);
        TreeNode child4 = new TreeNode(5);
        TreeNode child5 = new TreeNode(6);

        root.setLeft(child1);
        root.setRight(child2);

        child1.setLeft(child3);
        child1.setRight(child4);

        child2.setRight(child5);

        System.out.println(root);
    }
}

