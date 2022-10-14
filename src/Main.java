import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("countDown: ");
        Recursion.countDown(5);
        System.out.println();

        System.out.print("reverseString: ");
        Recursion.reverseString("abcdefg");
        System.out.println();

        System.out.print("power: ");
        System.out.print(Recursion.power(5,3));
        System.out.println();

        System.out.print("decimalToBinar: ");
        Recursion.decimalToBinar(13);
        System.out.println();

        System.out.print("reverseNumber: ");
        Recursion.reverseNumber(123456);
        System.out.println();

        System.out.print("Fibonachi: ");
        System.out.println(Recursion.Fibonachi(10) );
        System.out.println();

        System.out.print("factorial: ");
        System.out.println(Recursion.factorial(6) );
        System.out.println("");

    }



}