public class NumberToWords {
    public static void main(String[] args) {

        int num = 1450;
        int reversed = reverse(num);
        int count = getDigitCount(num);

        numberToWords(num);
    }

    public static void numberToWords(int number) {

        if(number < 10 && number >= 0) {
                switch (number) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
        } else {

            int fullCount = getDigitCount(number);
            number = reverse(number);
            int xCount = getDigitCount(number);

            if (number < 0) {
                System.out.println("Invalid Value");
            }
            do {
                int digit = number % 10;

                if (number >= 0) {
                    switch (digit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }

                    number /= 10;

                    //Last Number
                    if (number < 10) {
                        switch (number) {
                            case 1:
                                System.out.println("One");
                                break;
                            case 2:
                                System.out.println("Two");
                                break;
                            case 3:
                                System.out.println("Three");
                                break;
                            case 4:
                                System.out.println("Four");
                                break;
                            case 5:
                                System.out.println("Five");
                                break;
                            case 6:
                                System.out.println("Six");
                                break;
                            case 7:
                                System.out.println("Seven");
                                break;
                            case 8:
                                System.out.println("Eight");
                                break;
                            case 9:
                                System.out.println("Nine");
                                break;
                        }
                    }
                }
            } while (number > 0 && number > 9);

            for (int i = xCount; xCount < fullCount; xCount++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int x) {
        int result = 0;
        int num = 0;
        int count = 0;

        if(x < 10 && x >= 0) {
            result = x;
            return result;
        }

        while(x != 0) {
            num = x % 10;
            result += num;
            x /= 10;
            if (x != 0) {
                result *= 10;
            }
        }

        return result;
    }

    public static int getDigitCount(int number) {
        int invalid = -1;

        if (number < 0) {
            return invalid;
        } else if( number == 0) {
            return 1;
        } else {
            int num = 0;
            int count = 0;

            while(number != 0) {
                num = number % 10;
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
