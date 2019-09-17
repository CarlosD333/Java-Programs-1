public class EvenDigitSum {
    public static void main(String[] args) {

        int number = 25252;
        int sum = getEvenDigitSum(number);

        System.out.println(sum);
    }

    public static int getEvenDigitSum(int num) {

        int sum = 0;

        if(num < 0) {
            sum = -1;
        }

        while(num > 0) {
            if(num % 2 == 0) {
                sum += num % 10;
                num /= 10;
            } else {
                num /= 10;
            }
        }

        return sum;
    }
}
