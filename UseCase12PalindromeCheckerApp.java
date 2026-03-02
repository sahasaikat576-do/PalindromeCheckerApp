import java.util.Stack;

/**
 * 1. The Strategy Interface
 * Defines the contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * 2. Concrete Strategy: StackStrategy
 * This class provides a Stack based implementation.
 * It uses LIFO (Last-In-First-Out) behavior to reverse characters.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using a Stack.
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Step 1: Push each character of the input string onto the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Step 2: Compare characters by popping from the stack.
        // Popping retrieves characters in reverse order.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * 3. The Main Application Class
 */
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        // Initialize the Strategy (We choose StackStrategy here)
        PalindromeStrategy strategy = new StackStrategy();

        // Perform the check
        boolean isPalindrome = strategy.check(input);

        // Display the results as shown in your requirements
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome?   " + isPalindrome);
    }
}