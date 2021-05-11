public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(isPalindrome(args [i]));
        }
    }

    //Функция, которая возращает слово наоборт.
    public static String reverseString(String text) {
        String str = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            str += text.charAt(i);
        }
        return str;
    }

    //Функция, которая проверяет слово на палиндром.
    public static boolean isPalindrome(String s) {
        String str = s;
        return str.equals(reverseString(s));
    }
}
