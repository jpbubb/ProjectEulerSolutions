/*
 * ProjectEuler Problem 4
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */
package projecteulersolutions;

/**
 *
 * @author James Bubb
 */
public class Problem4 {

    public static void main(String[] args) {

        for (int i = 99; i > 1; i--) { // Find all the palindromic numbers
            for (int j = 99; j > 1; j--) { // That are the sum of 
                for (int k = 99; k > 1; k--) { // Three numbers up to 99
                    Integer number = new Integer(i * j * k);
                    if (isPalindrome(number.toString())) { // If the string representation of the number is a palindrome
                        System.out.println(i + " x " + j + " x " + k + " = " + number + " is palindromic"); // Output the sum
                    }
                }
            }
        }

    }

    public static boolean isPalindrome(String str) { // Checks to see if a string is a palindrome
        if (str.length() > 1) { // String has to be a least two characters long to be a palindrome
            if (str.length() % 2 == 0) { // The string's length is an even number so it must be a mirror image
                for (int i = 0; i < (str.length() / 2); i++) { // Loop to half of the strings length (checking from both ends at once)
                    if (str.charAt(i) != str.charAt((str.length() - i) - 1)) { // Check the first character with the last character, increment and check the next character pair
                        return false; // If any character pairs don't match, it can't be a palindrome
                    }
                }
            } else { // Must be an odd number of letters so has a central 'point'
                for (int i = 0; i < ((str.length() / 2) + 1); i++) { // Loop to half of the strings length + 1 as we have a central character
                    if (str.charAt(i) != str.charAt((str.length() - i) - 1)) { // Check the first character with the last character, increment and check the next character pair
                        return false; // If any character pairs don't match, it can't be a palindrome
                    }
                }
            }
            return true; // We've reached the end of a string and all the characters match so it must be a palindrome
        }
        return false; // String to small to test so it can't be a palindrome
    }
}
