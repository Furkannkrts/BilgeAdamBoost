package odev1;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsim girin: ");
        String name = scanner.nextLine();

        String replacedName = replaceVowelsWithNumbers(name);
        System.out.println("Sonuç: " + replacedName);
    }

    public static String replaceVowelsWithNumbers(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char replacedChar = currentChar;
            
            // Ünlü harf kontrolü (A, E, I, O, U)
            if (isVowel(currentChar)) {
                replacedChar = getVowelNumber(currentChar);
            }
            
            result.append(replacedChar);
        }
        
        return result.toString();
    }

    public static boolean isVowel(char c) {
        // Ünlü harf kontrolü (A, E, I, O, U)
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static char getVowelNumber(char c) {
        // Ünlü harf yerine yazılacak rakamı belirle (1, 2, 3, 4, 5, 6, 7, 8)
        switch (c) {
            case 'A':
            case 'a':
                return '1';
            case 'E':
            case 'e':
                return '2';
            case 'I':
            case 'i':
                return '3';
            case 'O':
            case 'o':
                return '4';
            case 'U':
            case 'u':
                return '5';
            default:
                return c;
        }
    }
}
