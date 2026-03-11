package PCAUseCases;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     PALINDROME CHECKER APP");
        System.out.println("==================================");

        String input = "Madam In Eden Im Adam";

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}