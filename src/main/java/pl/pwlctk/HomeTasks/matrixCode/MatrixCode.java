package pl.pwlctk.HomeTasks.matrixCode;

class MatrixCode {
    static String encode(String content) {
        int key = (int) Math.sqrt(content.length());
        if (key * key < content.length()) {
            key++;
        }
        StringBuilder encoded = new StringBuilder();
        int charIndex = 0;
        int matrixSize = key * key;
        for (int i = 1; i <= matrixSize; i++) {
            if (charIndex < content.length()) {
                encoded.append(content.charAt(charIndex));
            } else {
                encoded.append(" ");
            }
            charIndex = (charIndex + key) % matrixSize;
            if (i % key == 0) {
                charIndex++;
            }
        }
        return encoded.toString();
    }
}
