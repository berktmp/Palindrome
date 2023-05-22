public class Main {
    // Check if a string is a palindrome using two pointers
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        
        // Iterate until the two pointers meet
        while (i < j) {
            // Compare characters at the current pointers
            if (str.charAt(i) != str.charAt(j))
                return false; // Characters don't match, not a palindrome
            
            // Move the pointers towards the center
            i++;
            j--;
        }
        
        return true; // All characters matched, it's a palindrome
    }

    // Check if a string is a palindrome by comparing it with its reverse
    static boolean isPalindromeSec(String str) {
        String reverse = "";
        
        // Generate the reverse of the input string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Compare the original string with its reverse
        if (str.equals(reverse))
            return true; // It's a palindrome
        else
            return false; // Not a palindrome
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
