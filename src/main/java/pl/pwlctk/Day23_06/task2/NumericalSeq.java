package pl.pwlctk.Day23_06.task2;

class NumericalSeq {

    static void showSequences(int n) {

        //1--------------------------------------------
        for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        //2--------------------------------------------
        int number = -1;
        for (int i = 0; i < n; i++) {
            System.out.print(number + ", ");
            number = number * 2 + 3;
        }
        System.out.println();

        //3--------------------------------------------
        number = 2;
        boolean isPlus = false;
        for (int i = 0; i < n; i++) {
            if (number == 8 || number == 2) {
                isPlus = !isPlus;
            }
            System.out.print(number + ", ");

            if (isPlus) {
                number += 2;
            } else {
                number -= 2;
            }
        }
        System.out.println();

        //4--------------------------------------------
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.print(b + ", ");
            temp = b;
            b = b + a;
            a = temp;
        }
    }
}
