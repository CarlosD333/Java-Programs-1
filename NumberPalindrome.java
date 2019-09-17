public class NumberPalindrome {
    public static void main(String[] args) {

        int number = -707;

        boolean result = isPalindrome(number);

        System.out.println(result);
    }

    public static boolean isPalindrome(int num) {

        int number;

        boolean result = false;
        if(num < 0) {
            number = num * -1;
            num *= -1;
        } else {
            number = num;
        }

        int reverse = 0;
        int lastDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if(reverse == num) {
            result = true;
        }

        return result;
    }
}
