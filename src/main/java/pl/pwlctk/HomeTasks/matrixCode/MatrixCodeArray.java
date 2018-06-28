package pl.pwlctk.HomeTasks.matrixCode;

//Najpierw zadanie rozwiązałem za pomocą tej klasy, według mnie bardzo nieoptymalnie
class MatrixCodeArray {
    static String encrypt(String content) {
        int key = (int) Math.sqrt(content.length()) + 1;
        char[][] decryptMatrix = new char[key][key];
        StringBuilder decrypted = new StringBuilder();

        int counter = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < key; j++) {
                if (counter < content.length()) {
                    decryptMatrix[j][i] = content.charAt(counter++);
                }
            }
        }
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < key; j++) {
                decrypted.append(decryptMatrix[i][j]);
            }
        }
        return decrypted.toString();
    }

    static String decrypt(String content) {
        int key = (int) Math.sqrt(content.length());
        char[][] decryptMatrix = new char[key][key];
        StringBuilder decrypted = new StringBuilder();

        int counter = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < key; j++) {
                if (counter < content.length()) {
                    decryptMatrix[j][i] = content.charAt(counter++);
                }
            }
        }
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < key; j++) {
                decrypted.append(decryptMatrix[i][j]);
            }
        }
        return decrypted.toString();
    }
}
