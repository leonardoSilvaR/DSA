package com.data.structure.tree;

public class BinaryTree {


//        1
//    2       3
// 4     5       6


    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        Node child4 = new Node(5);
        Node child5 = new Node(6);

        root.setLeft(child1);
        root.setRight(child2);

        child1.setLeft(child3);
        child1.setRight(child4);

        child2.setRight(child5);

        System.out.println(root);
    }
}

class Node {
    private final int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
