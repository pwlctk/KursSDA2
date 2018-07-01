package pl.pwlctk.Day30_06.list;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<String> reversedList;

        list.add("Drzewo");
        list.add("Samochód");
        list.add("Dom");

        list.add(0, "Chmura");
        list.add(2, "Traktor");
        list.add(3, "Telefon");

        System.out.println(list);

        reversedList = list.reversed();
        System.out.println(reversedList);


    }
}
