public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "madam";

        // Call recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base Case 1: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // Base Case 2: If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move inward
        return check(s, start + 1, end - 1);
    }
}