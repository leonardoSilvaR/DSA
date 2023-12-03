package com.algorithms.trees;

import com.data.structure.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeIncludes {


    /**
     * Searching by specific value inside the tree
     * using BFS.
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * @param root   Binary tree
     * @param target search term
     * @return Returns -1 if value doesn't exist or root is null. Return target value if exists.
     */
    public int search(TreeNode root, int target) {
        int found = -1;
        if (root == null) return found;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();

            if (current.getData() == target) {
                found = current.getData();
                break;
            }

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }

        return found;
    }


    //TODO: To be implemented
    public boolean preOrderRecursiveSearch(TreeNode root, int target) {
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftChild = new TreeNode(2);
        TreeNode rightChild = new TreeNode(3);
        TreeNode leftChild1 = new TreeNode(4);

        root.setLeft(leftChild);
        root.setRight(rightChild);

        leftChild.setLeft(leftChild1);

        TreeIncludes treeIncludes = new TreeIncludes();
        System.out.println(treeIncludes.search(root, 6));
//        System.out.println(treeIncludes.preOrderRecursiveSearch(root, 2));
    }

}
