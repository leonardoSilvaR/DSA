package com.algorithms.trees;

import com.data.structure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSum {


    /**
     * Sum all items inside the tree.
     * Using DFS preorder;
     * Time Complexity O(n)
     * Space Complexity O(1)
     *
     * @param root Binary tree
     * @return total sum
     */
    public int sumRecursive(TreeNode root) {
        if (root == null) return 0;
        return root.getData() + sumRecursive(root.getLeft()) + sumRecursive(root.getRight());
    }

    /**
     * Sum all items inside the tree.
     * Using BFS;
     * Time Complexity O(n)
     * Space Complexity O(1)
     *
     * @param root Binary tree
     * @return total sum
     */
    public int sum(TreeNode root) {
        if (root == null) return -1;

        int sum = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();

            sum += current.getData();

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild1 = new TreeNode(4);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        leftChild.setLeft(leftChild1);

        TreeSum sum = new TreeSum();
        System.out.println(sum.sumRecursive(root));
        System.out.println(sum.sum(root));
    }

}
