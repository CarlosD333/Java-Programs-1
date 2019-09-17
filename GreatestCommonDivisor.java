public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int a = 12;
        int b = 30;

        int result = getGreatestCommonDivisor(a,b);

        System.out.println(result);
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int result = 1;

        if(first < 10 || second < 10) {
            return -1;
        }

        for (int outer = first; outer <= first && outer > 0; outer--) {
            if (first % outer == 0) {
                for (int inner = second; inner <= second && inner > 0; inner--) {
                    if (second % inner == 0 && inner == outer) {
                        return inner;
                    }
                }
            }
        }

        return result;
    }
}
