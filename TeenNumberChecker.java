public class TeenNumberChecker {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 12;

        boolean result = hasTeen(a,b,c);

        System.out.println(result);
    }

    public static boolean hasTeen(int a, int b, int c) {

        boolean result = false;

        if(a >= 13 && a <= 19) {
            result = true;
        }
        if(b >= 13 && b <= 19) {
            result = true;
        }
        if(c >= 13 && c <= 19) {
            result = true;
        }

        return result;
    }

    public static boolean isTeen(int x) {

        boolean result = false;

        if(x >= 13 && x <= 19) {
            result = true;
        }

        return result;
    }
}
