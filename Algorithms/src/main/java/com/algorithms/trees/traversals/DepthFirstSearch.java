package com.algorithms.trees.traversals;

import com.data.structure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final List<Integer> preOrderRecursiveValues = new ArrayList<>();

    /**
     * Tree traversal preOrder.
     * Time Complexity O(n)
     * Space Complexity O(n)
     *
     * @param root Binary tree
     * @return List of traversed nodes
     */
    public List<Integer> preOrder(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        if (root == null) return values;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            values.add(current.getData());

            if (current.getRight() != null) stack.push(current.getRight());
            if (current.getLeft() != null) stack.push(current.getLeft());
        }


        return values;
    }

    /**
     * Tree traversal preOrder recursively.
     * Time Complexity O(n)
     * Space Complexity O(n) because of list add values usage.
     * To improve space complexity just print root.data() this
     * will give space complexity of O(1).
     *
     * @param root Binary tree
     * @return List of traversed nodes
     */
    public List<Integer> preOrderRecursive(TreeNode root) {
        if (root == null) new ArrayList<>();

        if (root != null) {
            preOrderRecursiveValues.add(root.getData());
        }

        if (root.getLeft() != null) preOrderRecursive(root.getLeft());
        if (root.getRight() != null) preOrderRecursive(root.getRight());
        return preOrderRecursiveValues;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild1 = new TreeNode(4);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        leftChild.setLeft(leftChild1);

        DepthFirstSearch dfs = new DepthFirstSearch();
        System.out.println(dfs.preOrder(root));
        System.out.println(dfs.preOrderRecursive(root));
    }

}
