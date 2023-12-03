package com.algorithms.trees;

import com.data.structure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinValue {


    /**
     * Find minimum value inside the tree
     * using BFS.
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * @param root Binary tree
     * @return Returns -1 if root is null. Return minimum value.
     */
    public int minValue(TreeNode root) {
        if (root == null) return -1;

        int minValue = root.getData();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();

            if (current.getData() < minValue) {
                minValue = current.getData();
            }

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }

        return minValue;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild1 = new TreeNode(4);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        leftChild.setLeft(leftChild1);

        TreeMinValue treeMinValue = new TreeMinValue();
        System.out.println(treeMinValue.minValue(root));

    }

}
