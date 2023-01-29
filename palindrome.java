package Class15HW;

public class palindrome {
    Boolean ifPalindrome(String input) {
        StringBuilder str = new StringBuilder(input);
        if (input.equals(str.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        palindrome str=new palindrome();
        System.out.println(str.ifPalindrome("wow"));
    }
}
