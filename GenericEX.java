public class GenericEX {
    public static void main(String[] args) {
        Integer[] intArr = {3, 9, 8, 5, 3};

        String[] strArr = {"Red", "Blue", "Green", "Yellow", "Brown", "Black"};

        Double[] dblArr = {9.4d, 6.5d, 8.23d, 9.34d, 7.2123d};

        printArray(intArr);
        printArray(strArr);
        printArray(dblArr);
    }

    public static <T> void printArray(T[] arr) {
        T temp = arr[0];

        if (temp instanceof Integer) {
            System.out.print("Integer Array: ");
        } else if (temp instanceof String) {
            System.out.print("String Array: ");
        } else if (temp instanceof Double) {
            System.out.print("Double Array: ");
        }

        for (int i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
