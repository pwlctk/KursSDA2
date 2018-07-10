package pl.pwlctk.day01_07.completeBinaryTree;

public class Main {
    public static void main(String[] args) {
        CompleteBinaryTree<Integer> tree = new CompleteBinaryTree<>();

        tree.add(9);
        tree.add(53);
        tree.add(23);
        tree.add(66);
        tree.add(3);
        tree.add(87);
        tree.add(24);

        System.out.println(tree);

        System.out.println(tree.getLeftChild(2));
        System.out.println(tree.getRightChild(2));
    }
}
