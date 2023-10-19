package odev1;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin: ");
        String input = scanner.nextLine();

        System.out.print("Silinecek karakteri girin: ");
        char targetChar = scanner.next().charAt(0);

        String result = removeAllOccurrences(input, targetChar);
        System.out.println("Sonuç: " + result);
    }

    public static String removeAllOccurrences(String input, char targetChar) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Hedef karakteri bulduğumuzda bu karakteri atlıyoruz
            if (currentChar == targetChar) {
                continue;
            }

            result.append(currentChar);
        }

        return result.toString();
    }
}


