package pl.pwlctk.Day30_06.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> linkedStack = new LinkedStack<>();
        Stack<String> arrayStack = new ArrayStack<>(10);

        arrayStack.push("Drzewo");
        System.out.println(arrayStack.pop());

        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        System.out.println(linkedStack.isEmpty());

        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.size());

        System.out.println(linkedStack.isEmpty());
    }
}
