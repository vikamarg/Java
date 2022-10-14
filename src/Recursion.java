public class Recursion {
    public static String reverseString(final String inStr) {

        if (inStr.length() == 1) {
            System.out.print(inStr.charAt(0));
            return String.valueOf(inStr.charAt(0));
        }
        String reverse = reverseString(inStr.substring(1));
        System.out.print(inStr.charAt(0));
        return inStr;
    }

    public static String reverseNumber(int number) {
        String letsHaveALittleFun = String.valueOf(number);
        return reverseString(letsHaveALittleFun);
    }

    public static int countDown(final int number) {
        if (number == 0) {
            System.out.println(0);
            return 0;
        }
        System.out.println(number);
        return countDown(number - 1);
    }

    public static int power(final int a, final int b) {
        if (b == 1)
            return a * 1;
        return a * power(a, b - 1);
    }

    public static int decimalToBinar(int number) {
        if (number == 1) {
            System.out.print(1);
            return 1;
        }
        int binar = decimalToBinar(number / 2);
        System.out.print(number % 2);
        return binar;
    }

    public static int Fibonachi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibonachi = Fibonachi(n - 1) + Fibonachi(n - 2);
        return fibonachi;
    }

    public static int factorial(int number) {
        if (number == 1)
            return 1;
        return number*factorial(number - 1);
    }
}
