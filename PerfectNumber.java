public class PerfectNumber {
    public static void main(String[] args) {

        int num = 28;

        boolean result = isPerfectNumber(num);

        System.out.println(result);
    }

    public static boolean isPerfectNumber(int number) {

        int sum = 0;

        if(number >= 1) {

            for (int i = 1; i < number; i++) {
                if(number % i == 0) {
                    sum += i;
                }
            }
            if(sum == number) {
                return true;
            }
        }

        return false;
    }
}
