package PCAUseCases;

import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Reverse string method
    public static boolean reverseCheck(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Stack method
    public static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     PALINDROME CHECKER APP");
        System.out.println("==================================");

        String word = "madam";

        // Reverse algorithm timing
        long start1 = System.nanoTime();
        boolean result1 = reverseCheck(word);
        long end1 = System.nanoTime();

        // Stack algorithm timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Algorithm Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Algorithm Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("Program Ended.");
    }
}