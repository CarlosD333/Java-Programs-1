package CarlosDegollado;

public class RecursiveMethods {
    // This method calls the sumSquareRec method and returns the sum of the
    // squares of the elements in the array.
    public int sumSquares(int[] A)
    {
        // Do not make any changes to this method!
        return sumSquaresRec(A, 0);
    }

    // This method takes an integer array as well as an integer (the starting
    // index) and returns the sum of the squares of the elements in the array.
    public int sumSquaresRec(int[] A, int pos)
    {
        if(pos == A.length - 1) {
            return A[pos] * A[pos];
        }

        int sum = sumSquaresRec(A, pos + 1);
        sum += A[pos] * A[pos];

        return sum;
    }

    // This method takes a character stack and converts all lower case letters
    // to upper case ones.
    public void upperStackRec(CharStack s)
    {
        char poppedCh;

        if (s.isEmpty()) {
            return;
        }

        poppedCh = s.pop();
        String tempS = poppedCh + "";
        tempS = tempS.toUpperCase();
        poppedCh = tempS.charAt(0);

        upperStackRec(s);

        s.push(poppedCh);
    }

    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s)
    {
        String strReversed = "";

        if (s.isEmpty()) {
            return "";
        }

        strReversed += reverseStringRec(s.substring(1)) + s.charAt(0);

        return strReversed;

        //return strReversed;
    }

    // This method takes a reference to the head of a linked list.
    // It returns the reference to the head of the linked list in the reversed order.
    public LNode reverseListRec(LNode head)
    {
        if (head == null) {     // case where theres no list
            return null;
        }

        LNode rest = head.getLink();

        if (rest == null) {     //case where its just one
            return head;
        }

        LNode newHead = reverseListRec(rest);       //case where there is two or more
        rest.setLink(head);
        head.setLink(null);

        return newHead;
    }
}
