package pl.pwlctk.day01_07.tree;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("A", null, null);
        Node c = new Node("C", null, null);
        Node e = new Node("E", null, null);
        Node h = new Node("H", null, null);
        Node d = new Node("D", c, e);
        Node b = new Node("B", a, d);
        Node i = new Node("I", h, null);
        Node g = new Node("G", null, i);
        Node root = new Node("F", b, g);

        BinaryTree tree = new BinaryTree(root);
        tree.showTree();

    }
}
