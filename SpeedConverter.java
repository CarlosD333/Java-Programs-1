public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(95.75d);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long result = -1;

        if(kilometersPerHour >= 0) {
            result = Math.round((kilometersPerHour / 1.609344d) * 1d);
        }

        return result;
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else if(kilometersPerHour >= 0) {

            long mph = Math.round((kilometersPerHour / 1.609d) * 1d);


            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }
}