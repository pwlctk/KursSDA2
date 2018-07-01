package pl.pwlctk.day01_07.tree;

class Node {
    private String value;
    private Node leftChild;
    private Node rightChild;

    Node(String value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    String getValue() {
        return value;
    }

    Node getLeftChild() {
        return leftChild;
    }

    Node getRightChild() {
        return rightChild;
    }
}
