package pl.pwlctk.HomeTasks.matrixCode;

class MatrixCode {
    static String encrypt(String content) {
        int key = (int) Math.sqrt(content.length()) + 1;
        return encode(content, key);
    }

    static String decrypt(String content) {
        int key = (int) Math.sqrt(content.length());
        return encode(content, key);
    }

    //Aby nie powtarzać dwa razy tego samego kodu dodałem prywatną metodę encode
    private static String encode(String content, int key) {
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
