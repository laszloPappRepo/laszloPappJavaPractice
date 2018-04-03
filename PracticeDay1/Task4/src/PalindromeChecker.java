public class PalindromeChecker {
    public static void main(String[] args) {

        System.out.println(searchPalindrome("geza kek az eg"));
    }

    public static String searchPalindrome(String inputString) {
        String spacelessString;
        String reversedString = "";

        spacelessString = inputString.replaceAll(" ","");
        for (int i = spacelessString.length() - 1; i >= 0; i--) {
            reversedString += spacelessString.charAt(i);
        }
        if (reversedString.equals(spacelessString)){
            System.out.println("Our string is a palindrome one");
        }else{
            System.out.println("It's not :(");
        }

        return reversedString;
    }
}