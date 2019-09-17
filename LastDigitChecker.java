public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (a < 10 || a > 1000) {
            return false;
        }
        if (b < 10 || b > 1000) {
            return false;
        }
        if (c < 10 || c > 1000) {
            return false;
        }

        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int x) {
        if (x >= 10 && x <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
