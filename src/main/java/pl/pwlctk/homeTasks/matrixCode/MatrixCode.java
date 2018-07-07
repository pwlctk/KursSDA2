package pl.pwlctk.homeTasks.matrixCode;

class MatrixCode {
    static String encode(String content) {
        int key = (int) Math.ceil(Math.sqrt(content.length()));
        System.out.println(content.length());
        System.out.println(key);
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
