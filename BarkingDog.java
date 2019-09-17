public class BarkingDog {

    public static void main(String[] args) {
        boolean result = shouldWakeUp(true, 4);
        System.out.println(result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean result = false;

        if(hourOfDay < 0 || hourOfDay > 23) {
            result = false;
        } else if((hourOfDay < 8 || hourOfDay > 22) && barking == true) {
            result = true;
        }

        return result;
    }
}
