import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {

        boolean result = areEqualByThreeDecimalPlaces(-3.1756d, -3.175d);

        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        boolean result = false;

        int aa = (int)(a * 1000);
        int bb = (int)(b * 1000);

        if(aa == bb) {
            result = true;
        }

        return result;
    }
}
