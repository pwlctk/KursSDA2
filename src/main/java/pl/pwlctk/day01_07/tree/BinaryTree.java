package pl.pwlctk.day01_07.tree;

class BinaryTree {

    private Node root;

    BinaryTree(Node node) {
        this.root = node;
    }

    void showTree(DfsType dfsType) {
        System.out.print(dfsType.name()+ ": ");
        dfsType.showTree(root);
        System.out.println();
    }
}
