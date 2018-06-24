package pl.pwlctk.Day24_06.task3;

class Cezar {

    static String encryption(String word) {
        StringBuilder encryptionWord = new StringBuilder();
        char character;
        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            character += 3;
            encryptionWord.append(character);
        }
        return encryptionWord.toString();
    }

    static String decryption(String word) {
        StringBuilder decryptionWord = new StringBuilder();
        char character;
        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            character -= 3;
            decryptionWord.append(character);
        }
        return decryptionWord.toString();
    }
}
