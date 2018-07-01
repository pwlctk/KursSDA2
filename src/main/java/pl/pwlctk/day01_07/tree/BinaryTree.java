package pl.pwlctk.day01_07.tree;

class BinaryTree {
    private Node root;

    BinaryTree(Node node) {
        this.root = node;
    }

    void showTree() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            visit(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    private void visit(Node node) {
        System.out.print(node.getValue() + " ");
    }
}
