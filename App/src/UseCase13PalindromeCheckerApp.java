/**
 * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */

// Strategy Interface
interface PalindromeStrategy {
    boolean isValid(String input);
}

// Concrete Strategy: Standard Pointer Comparison
class StandardPalindromeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null) return false;
        String clean = input.toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Input setup
        String input = "level";
        PalindromeStrategy strategy = new StandardPalindromeStrategy();

        // Capture execution start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the validation
        boolean isPalindrome = strategy.isValid(input);

        // Capture execution end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long executionTime = endTime - startTime;

        // Display benchmarking results as per the screenshot requirements
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}