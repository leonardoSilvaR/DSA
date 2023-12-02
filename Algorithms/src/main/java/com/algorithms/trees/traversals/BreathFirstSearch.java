package com.algorithms.trees.traversals;

import com.data.structure.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathFirstSearch {

    /**
     * BFS using queue.
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * @param root Binary tree
     * @return traversal order
     */
    public List<Integer> search(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (queue.size() > 0) {
            TreeNode current = queue.remove();
            values.add(current.getData());

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }

        return values;
    }


    //TODO:To implement recursive first the height of the tree must be known
    public void searchRecursive(TreeNode root) {

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild1 = new TreeNode(4);
        TreeNode leftChild2 = new TreeNode(6);
        TreeNode rightChild1 = new TreeNode(7);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        leftChild.setLeft(leftChild1);

        rightChild.setLeft(leftChild2);
        rightChild.setRight(rightChild1);


        BreathFirstSearch bsf = new BreathFirstSearch();
        System.out.println(bsf.search(root));
    }

}

