public class LeapYear {

    public static void main(String[] args) {
        boolean result = isLeapYear(1924);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {

        boolean result = false;
        if(year >= 1 && year <= 9999) {
            if(year % 4 == 0) {
                if (year % 100 == 0) {
                    if(year % 400 == 0) {
                        result = true;
                    } else {
                        result = false;
                    }
                } else {
                    result = true;
                }
            } else {
                result = false;
            }
        }

        return result;
    }
}
