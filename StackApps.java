package CarlosDegollado;

// The StackApps class that implements two Stack applications
// Carlos J Degollado

public class StackApps
{
    // convert a decimal number into a binary number and save it in a stack
    // Do not create any arrays! Do not use any Java libraries to do the convertion.
    // Doing so will result in points deduction.
    public String decToBin(int numDec)
    {
        //method variables
        GenericStackArray stackBinary = new GenericStackArray(64);  // stack used to store the result binary number
        int remainder;
        int quotient;

        //conversion loop
        do {
            remainder = numDec % 2;
            quotient = numDec / 2;

            //store binary character
            if (remainder == 0) {
                stackBinary.push('0');
            } else if (remainder == 1) {
                stackBinary.push('1');
            }

            //numDec division
            numDec = quotient;
        } while (quotient != 0);

        return stackBinary.toString();  // return a string representation of the stack
    }

    // compute the sum of the two big intergers and save the result in a stack
    // Do not create any arrays! Do not use any Java libraries to do the calculation.
    // Doing so will result in points deduction.
    public String addBigIntegers(String num1, String num2)
    {
        //method variables
        GenericStackArray stackNum1 = new GenericStackArray(64);    // stack used to store number 1
        GenericStackArray stackNum2 = new GenericStackArray(64);    // stack used to store number 2
        GenericStackArray stackResult = new GenericStackArray(64);  // stack used to store the result of the addition
        char digit1;
        char digit2;
        char sumCh;
        int sum;
        int carry = 0;

        //number-length equilizer
        while (num1.length() != num2.length()) {
            if (num1.length() > num2.length()) {
                num2 = "0" + num2;
            } else {
                num1 = "0" + num1;
            }
        }

        //retrieval-addition-storage loop
        for (int i = num1.length() - 1; i >= 0; i--) {
            //loop variables
            digit1 = num1.charAt(i);
            digit2 = num2.charAt(i);

            //store operands
            stackNum1.push(digit1);
            stackNum2.push(digit2);

            //addition-carryover
            sum = (digit1 - '0') + (digit2 - '0') + carry;
            if (sum > 9) {
                carry = sum / 10;
                sum %= 10;
            } else {
                carry = 0;
            }

            //sum digit to stackResult storage
            sumCh = (char)(sum + '0');
            stackResult.push(sumCh);

            //final carry-digit condition
            if (carry > 0 && i == 0) {
                sumCh = (char)(carry + '0');
                stackResult.push(sumCh);
            }
        }

        return stackResult.toString();  // return a string representation of the stack
    }
}
