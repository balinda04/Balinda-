/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20application;

/**
 *
 * @author uyser
 */
import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static void main(String[] args) {
        int length = 12; // Default password length
        boolean includeLowercase = true;
        boolean includeUppercase = true;
        boolean includeNumbers = true;
        boolean includeSpecialChars = true;

        // Generate the password
        String password = generatePassword(length, includeLowercase, includeUppercase, includeNumbers, includeSpecialChars);

        // Display the generated password
        System.out.println("Generated Password: " + password);
    }

    // Static method to generate a random password based on specified criteria
    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase,
                                           boolean includeNumbers, boolean includeSpecialChars) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Define characters to include based on criteria
        String characters = "";
        if (includeLowercase) {
            characters += LOWERCASE_CHARACTERS;
        }
        if (includeUppercase) {
            characters += UPPERCASE_CHARACTERS;
        }
        if (includeNumbers) {
            characters += NUMBERS;
        }
        if (includeSpecialChars) {
            characters += SPECIAL_CHARACTERS;
        }

        // Generate password characters randomly
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
