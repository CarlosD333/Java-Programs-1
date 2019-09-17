public class SharedDigit {
    public static void main(String[] args) {

        int a = 39;
        int b = 23;

        boolean result = hasSharedDigit(a,b);

        System.out.println(result);
    }

    public static boolean hasSharedDigit(int a, int b) {

        boolean result = false;
        int same = 0;

        if (a < 10 || a > 99) {
            return false;
        }
        if (b < 10 || b > 99) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int firstA = a / 10;
        int firstB = b / 10;

//        System.out.println("last a is " + lastA);
//        System.out.println("last b is " + lastB);
//        System.out.println("first a is " + firstA);
//        System.out.println("first B is " + firstB);

        if (firstA == firstB || lastA == lastB || firstA == lastB || firstB == lastA) {
            return true;
        } else {
            return false;
        }
    }
}
