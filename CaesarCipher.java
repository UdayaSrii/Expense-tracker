import java.util.Scanner;
public class CaesarCipher {
    // The shift value
    public static String encrypt(String text, int shift) {
        // The empty string to store the encrypted text
        StringBuilder result = new StringBuilder();
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + shift) % 26 + base);
            }
            // Add the encrypted character to the result
            result.append(c);
        }
        // The encrypted text
        return result.toString();
    }
    // Create the main method
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter text to encrypt: ");
        String text = sc.nextLine();
        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted text: " + encryptedText);
    }
}

