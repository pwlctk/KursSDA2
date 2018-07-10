package pl.pwlctk.day01_07.heap;

public class Main {
    public static void main(String[] args) {
        Heap tree = new Heap();

        tree.add(60);
        tree.add(50);
        tree.add(40);
        tree.add(15);
        tree.add(20);

        System.out.println(tree);
        System.out.println(tree.remove());
        System.out.println(tree);
        System.out.println(tree.remove());
        System.out.println(tree);
        System.out.println(tree.remove());
        System.out.println(tree);
        System.out.println(tree.remove());
        System.out.println(tree);
        System.out.println(tree.remove());
        System.out.println(tree);


    }
}
