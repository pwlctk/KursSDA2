package pl.pwlctk.day23_06.task3;

class Figures {

    static void triangle(int w) {
        StringBuilder symbol = new StringBuilder("*");
        for (int i = 0; i < w; i++) {
            System.out.println(symbol);
            symbol.append("*");
        }
    }

    static void line(int w) {
        StringBuilder symbol = new StringBuilder("*");
        for (int i = 0; i < w; i++) {
            System.out.println(symbol);
            symbol.insert(i, " ");
        }
    }

    static void square(int h, int w) {
        StringBuilder symbol = new StringBuilder("*");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 || j == 0) {
                    System.out.print(symbol);
                } else if (i == w - 1) {
                    System.out.print(symbol);
                } else if (j == (h - 1)) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void cross(int w) {
        StringBuilder symbol = new StringBuilder("*");
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                if (i == j || (j + i) == w - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



}
