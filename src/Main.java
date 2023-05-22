public class Main {
    
    // Checks if an integer is a palindrome
    static boolean isPalindrome(int num) {
        int reversedNum = 0;
        int originalNum = num;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    // Checks if an integer is a palindrome (alternative approach using string comparison)
    static boolean isPalindromeSec(int num) {
        String str = String.valueOf(num);
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
    }
}
