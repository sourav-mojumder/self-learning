package arrays;

public class Palindrome {

    public static boolean isPalindrome(String s) {

        int leftPtr = 0, rightPtr = s.length() - 1;
        while (leftPtr < rightPtr) {
            if (s.charAt(leftPtr++) != s.charAt(rightPtr--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s  = "hello";
        System.out.println(isPalindrome(s));
    }
}
