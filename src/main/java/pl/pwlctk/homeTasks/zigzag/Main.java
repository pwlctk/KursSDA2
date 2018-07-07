package pl.pwlctk.homeTasks.zigzag;

public class Main {
    public static void main(String[] args) {
        String message = "Kurs programowania w Javie";
        int key = 3;
        String encryptedMessage = ZigzagCipher.encrypt(message, key);
        String decryptedMessage = ZigzagCipher.decrypt(encryptedMessage, key);

        System.out.println("Wiadomość: " + message);
        System.out.println();
        System.out.println("Wiadomość zaszyfrowana: " + encryptedMessage);
        System.out.println("Wiadomość odszyfrowana: " + decryptedMessage);
    }
}
