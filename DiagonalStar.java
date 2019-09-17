public class DiagonalStar {

    public static void main(String[] args) {

        int num = 8;

        printSquareStar(num);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        }
        if (number >= 5) {

            for (int row = 1; row < number +1; row++) {

                for (int col = 1; col < number; col++) {
                    if (row == 1 || row == number || col == 1 || col == number ||
                    row == col || col == (number - row + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
