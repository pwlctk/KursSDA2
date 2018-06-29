package pl.pwlctk.HomeTasks.zigzag;

class ZigzagCipher {

    static String encrypt(String message, int railKey) {
        StringBuilder sentence = new StringBuilder();
        StringBuilder messageToEncrypt = new StringBuilder(message);
        //Aby dekodowanie dzialalo dlugosc wiadomości musi być podzielna przez 4 dlatego dodaje spacje na końcu
        if (messageToEncrypt.length() % 4 != 0) {
            for (int i = 0; i < 4 -(message.length()%4); i++) {
                messageToEncrypt.append(" ");
            }
        }

        int matrixLength = messageToEncrypt.length();
        char[][] matrix = new char[railKey][matrixLength];

        int zigzag = 0;
        boolean downUp = true;
        //wypełniam macierz gwiazdkami
        for (int i = 0; i < railKey; i++) {
            for (int j = 0; j < messageToEncrypt.length(); j++) {
                matrix[i][j] = '*';
            }
        }
        //wypełniam macierz literami w zigzag
        for (int i = 0; i < matrixLength; i++) {
            matrix[zigzag][i] = messageToEncrypt.charAt(i);
            if (downUp) {
                zigzag++;
            } else {
                zigzag--;
            }
            if (zigzag == 0 || zigzag == railKey - 1) {
                downUp = !downUp;
            }
        }

        //Dodaje do StringBuildera
        for (int i = 0; i < railKey; i++) {
            for (int j = 0; j < matrixLength; j++) {
                if (matrix[i][j] != '*') {
                    sentence.append(matrix[i][j]);
                }
            }
        }
        return sentence.toString();
    }

    static String decrypt(String message, int railKey) {
        StringBuilder sentence = new StringBuilder();
        char[][] matrix = new char[railKey][message.length()];

        //zapełniam macierz gwiazdkami
        for (int i = 0; i < railKey; i++) {
            for (int j = 0; j < message.length(); j++) {
                matrix[i][j] = '*';
            }
        }
        int index = 0;
        int zigzag = 0;
        boolean downUp = true;
        //Tworzenie zigzaga z zaszyfrowanej wiadomości
        //nie wiem dlaczego ale dziala tylko dla ciągów o długości podzielnej przez 4
        for (int i = 0; i < railKey; i++) {
            for (int j = 0; j < message.length(); j++) {
                if (zigzag == i) {
                    matrix[zigzag][j] = message.charAt(index);
                    index++;
                }
                if (downUp) {
                    zigzag++;
                } else {
                    zigzag--;
                }
                if (zigzag == 0 || zigzag == railKey - 1) {
                    downUp = !downUp;
                }

            }
        }

        //Wpisywanie wartości do StringBuildera
        for (int i = 0; i < message.length(); i++) {
            sentence.append(matrix[zigzag][i]);
            if (downUp) {
                zigzag++;
            } else {
                zigzag--;
            }
            if (zigzag == 0 || zigzag == railKey - 1) {
                downUp = !downUp;
            }
        }

        return sentence.toString().trim();
    }

}
