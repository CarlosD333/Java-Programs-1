public class FirstLastDigitSum {
    public static void main(String[] args) {

        int number = -5738;

        int result = sumFirstAndLastDigit(number);

        System.out.println(result);
    }

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;

        if(number < 0) {
            sum = -1;
        }

        lastDigit = number % 10;

        while(number > 0) {
            if(number < 10) {
                sum = lastDigit + lastDigit;
                number /= 10;
            } else {
                number /= 10;
                if(number < 10) {
                    firstDigit = number;
                    sum = lastDigit + firstDigit;
                    number /= 10;
                }
            }
        }

        return sum;
    }
}
