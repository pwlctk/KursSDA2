package pl.pwlctk.HomeTasks.matrixCode;

public class Main {
    public static void main(String[] args) {
        String message = "Kurs programowania w Javie".toUpperCase();
        String encryptedMessage = MatrixCode.encode(message);
        String decryptedMessage = MatrixCode.encode(encryptedMessage);
        System.out.println("Wiadomość do zaszyfrowania: " + message);
        System.out.println();
        System.out.println("Metoda optymalna: ");
        System.out.println("Wiadomość po zaszyfrowaniu: " + encryptedMessage);
        System.out.println("Wiadomość po odszyfrowaniu: " + decryptedMessage);

        System.out.println();
        System.out.println("Metoda tablicowa:");
        String encryptedMessageArray = MatrixCodeArray.encode(message);
        String decryptedMessageArray = MatrixCodeArray.encode(encryptedMessageArray);
        System.out.println("Wiadomość po zaszyfrowaniu: " + encryptedMessageArray);
        System.out.println("Wiadomość po odszyfrowaniu: " + decryptedMessageArray);


    }
}
