public class EqualSumChecker {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 40;

        boolean result = hasEqualSum(a,b,c);

        System.out.println(result);

    }

    public static boolean hasEqualSum(int a, int b, int c) {

        boolean result = false;

        if(a + b == c) {
            result = true;
        }

        return result;
    }
}
