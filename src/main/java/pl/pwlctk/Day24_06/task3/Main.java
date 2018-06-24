package pl.pwlctk.Day24_06.task3;

public class Main {
    public static void main(String[] args) {
        String word = "KURS PROGRAMOWANIA W JAVIE";
        String encryptionWord = Cezar.encryption(word);
        String decryptionWord = Cezar.decryption(encryptionWord);

        System.out.println("Zdanie do zaszyfrowania: " + word);

        System.out.println("\nZdanie po zaszyfrowaniu:");
        System.out.println(encryptionWord);
        System.out.println("\nZdanie po odszyfrowaniu:");
        System.out.println(decryptionWord);

    }
}
