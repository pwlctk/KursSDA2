package pl.pwlctk.HomeTasks.matrixCode;

class MatrixCodeArray {
    static String encode(String content) {
        int key = (int) Math.sqrt(content.length());
        if (key * key < content.length()) {
            key++;
        }
        char[][] decryptMatrix = new char[key][key];
        StringBuilder encoded = new StringBuilder();

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
                encoded.append(decryptMatrix[i][j]);
            }
        }
        return encoded.toString();
    }
}
