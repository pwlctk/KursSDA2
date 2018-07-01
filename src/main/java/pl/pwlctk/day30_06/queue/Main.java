package pl.pwlctk.day30_06.queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> kolejka = new LinkedQueue<>();
        kolejka.push("Drzewo");
        kolejka.push("Samochód");
        kolejka.push("Dom");
        kolejka.push("Chmura");
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());
        kolejka.push("coś nowego");
        System.out.println(kolejka.pop());
        System.out.println(kolejka.pop());


    }

}
