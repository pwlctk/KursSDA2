package pl.pwlctk.day23_06.task3;

public class Main {
    public static void main(String[] args) {
        int width = 10;
        int height = 20;

        Figures.triangle(width);
        System.out.println();
        Figures.line(width);
        System.out.println();
        Figures.square(width, height);
        System.out.println();
        Figures.cross(width);
    }
}
