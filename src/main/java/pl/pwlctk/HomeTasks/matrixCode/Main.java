package pl.pwlctk.HomeTasks.matrixCode;

public class Main {
    public static void main(String[] args) {
        String message = "Kurs programowania w Javie".toUpperCase();
        String encryptedMessage = MatrixCode.encrypt(message);
        String decryptedMessage = MatrixCode.decrypt(encryptedMessage);
        System.out.println("Wiadomość do zaszyfrowania: " + message);
        System.out.println();
        System.out.println("Metoda optymalna: ");
        System.out.println("Wiadomość po zaszyfrowaniu: " + encryptedMessage);
        System.out.println("Wiadomość po odszyfrowaniu: " + decryptedMessage);

        System.out.println();
        System.out.println("Metoda standardowa:");
        String encryptedMessageArray = MatrixCodeArray.encrypt(message);
        String decryptedMessageArray = MatrixCodeArray.decrypt(encryptedMessageArray);
        System.out.println("Wiadomość po zaszyfrowaniu: " + encryptedMessageArray);
        System.out.println("Wiadomość po odszyfrowaniu: " + decryptedMessageArray);


    }
}
