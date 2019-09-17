public class FlourPacker {

    public static void main(String[] args) {

        boolean result = canPack(1,0,4);

        System.out.println("result is " + result);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(bigCount == 0 && smallCount == 0 && goal == 0) {
            return false;
        }

        int big = bigCount * 5;

        if( big + smallCount >= goal) {
            if(goal < smallCount) {
                return true;
            }

            if (goal % big == 0) {
                return true;
            }

            if(goal % big <= smallCount) {
                return true;
            }
        }

        return false;
    }
}
