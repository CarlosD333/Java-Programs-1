package CarlosDegollado;

public class PrintTriangles {

    public static void main(String[] args) {
	    printTriangles(5);
    }

    public static void printTriangles(int sideLength) {
        if (sideLength < 1) {
            return;
        }

        printTriangles(sideLength-1);
        for (int i = 0; i < sideLength; i++) {
            System.out.print("[]");
        }
        System.out.println();
    }
}
