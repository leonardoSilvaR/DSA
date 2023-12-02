package com.algorithms.trees.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreathSearchFirst {

    /**
     * BFS using queue.
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * @param root Binary tree
     * @return traversal order
     */
    public List<Integer> search(Node root) {
        if (root == null) return new ArrayList<>();

        List<Integer> values = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (queue.size() > 0) {
            Node current = queue.remove();
            values.add(current.data);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return values;
    }


    //TODO:To implement recursive first the height of the tree must be known
    public void searchRecursive(Node root) {

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node leftChild = new Node(2);
        Node rightChild = new Node(3);
        Node leftChild1 = new Node(4);
        Node leftChild2 = new Node(6);
        Node rightChild1 = new Node(7);

        root.left = leftChild;
        root.right = rightChild;

        leftChild.left = leftChild1;

        rightChild.left = leftChild2;
        rightChild.right = rightChild1;


        BreathSearchFirst bsf = new BreathSearchFirst();
        System.out.println(bsf.search(root));
        
    }


}

class Node {
    final int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

//    public int getData() {
//        return data;
//    }
//
//    public Node getLeft() {
//        return left;
//    }
//
//    public Node getRight() {
//        return right;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public void setRight(Node right) {
//        this.right = right;
//    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
