package pl.pwlctk.Day30_06.list;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.append("Drzewo");
        list.append("Samochód");
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
