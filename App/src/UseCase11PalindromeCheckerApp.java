// Palindrome Service Class
class PalindromeService {

    /**
     * Checks whether the given string is a palindrome
     * using two-pointer approach.
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


// Main Application Class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call method
        boolean result = service.checkPalindrome(input);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}