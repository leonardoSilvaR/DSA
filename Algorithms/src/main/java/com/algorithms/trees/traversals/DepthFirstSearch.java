package com.algorithms.trees.traversals;

import com.data.structure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private final List<Integer> preOrderRecursiveValues = new ArrayList<>();
    private final List<Integer> posOrderRecursiveValues = new ArrayList<>();
    private final List<Integer> inOrderRecursiveValues = new ArrayList<>();

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

    //      1
//    2   3
//  4
// Output: 4,2,3,1
//    TODO: To be implemented
    public List<Integer> posOrder(TreeNode root) {
//        List<Integer> values = new ArrayList<>();
//        if (root == null) return values;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode current = stack.peek();
//
//            if (current.getRight() != null) {
//                System.out.println("Right> " + current.getRight());
//                stack.push(current.getRight());
//            }
//
//            if (current.getLeft() != null) {
//                System.out.println("Left> " + current.getLeft());
//                stack.push(current.getLeft());
//            }
//
//        }
        return new ArrayList<>();
    }

    //      1
//    2   3
//  4
// Output: 4, 2, 1, 3
//    TODO: To be implemented
    public List<Integer> inOrder(TreeNode root) {
//        List<Integer> values = new ArrayList<>();
//        if (root == null) return values;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode current = stack.pop();
//            values.add(current.getData());
//
//            if (current.getRight() != null) stack.push(current.getRight());
//            if (current.getLeft() != null) stack.push(current.getLeft());
//        }

        return new ArrayList<>();
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

    /**
     * Tree traversal posOrder recursively.
     * Time Complexity O(n)
     * Space Complexity O(n) because of list add values usage.
     * To improve space complexity just print root.data() this
     * will give space complexity of O(1).
     *
     * @param root Binary tree
     * @return List of traversed nodes
     */
    public List<Integer> posOrderRecursive(TreeNode root) {
        if (root == null) new ArrayList<>();

        if (root.getLeft() != null) posOrderRecursive(root.getLeft());
        if (root.getRight() != null) posOrderRecursive(root.getRight());
        posOrderRecursiveValues.add(root.getData());
        return posOrderRecursiveValues;
    }

    /**
     * Tree traversal inOrder recursively.
     * Time Complexity O(n)
     * Space Complexity O(n) because of list add values usage.
     * To improve space complexity just print root.data() this
     * will give space complexity of O(1).
     *
     * @param root Binary tree
     * @return List of traversed nodes
     */
    public List<Integer> inOrderRecursive(TreeNode root) {
        if (root == null) new ArrayList<>();

        if (root.getLeft() != null) inOrderRecursive(root.getLeft());
        inOrderRecursiveValues.add(root.getData());
        if (root.getRight() != null) inOrderRecursive(root.getRight());

        return inOrderRecursiveValues;
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
//        System.out.println(dfs.preOrder(root));
        System.out.println(dfs.posOrder(root));
//        System.out.println(dfs.posOrderRecursive(root));
//        System.out.println(dfs.inOrderRecursive(root));
//        dfs.inOrderRecursive(root);
//        System.out.println(dfs.preOrderRecursive(root));

    }

}
