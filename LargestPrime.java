public class LargestPrime {

    public static void main(String[] args) {

        int test = 12;

        int result = getLargestPrime(test);

        System.out.println("result is " + result);
    }

    public static int getLargestPrime(int number) {

        int result = -1;

        if(number <= 1) {
            return result;
        }

        if(number > 1) {

            result = 0;

            for (int i = 1; i <= number - 1; i++) {

                if (number % i == 0) {
                    if (i == 2) {
                        result = 2;
                    }
                    if (i == 3) {
                        result = 3;
                    }
                    if (i % 2 != 0 && i % 3 != 0) {
                        result = i;
                    }
                }
            }
        }

        if(result == 1) {
            result = number;
        }

        return result;
    }
}
