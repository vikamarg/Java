import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.print("input number1: ");
        int input1 = scanner.nextInt() ;

        System.out.print("input number2: ");
        int input2 = scanner.nextInt() ;

        System.out.print("input number3: ");
        int input3 = scanner.nextInt() ;

        System.out.println("Smallest number is: " + SmallestNumber(input1, input2, input3) );
        System.out.println("Avarage Number is: " + AvarageNumber(input1, input2, input3) );
        System.out.println("\n");

        System.out.print("input a String to find vowels and middle char: ");
        String inputString = scanner.next();

        System.out.println("Middle Char is: " +  MiddleChar(inputString) );

        System.out.println("Find Vowels: " +  FindVowels(inputString)  );
        System.out.println("\n");

        Scanner sc = new Scanner( System.in );
        System.out.print("input a sentance: ");
        String inputLine = sc.nextLine();
        System.out.println("Count of words in sentance:  " +  CountOfWords(inputLine)  );
        System.out.println("\n");


        System.out.print( "input  number to count sum of digits: ");
        int input4 = scanner.nextInt() ;
        System.out.println( "Sum of digits: " + SumOfDigits( input4 ) );
        System.out.println("\n");

        System.out.print( "input size of pentagonal series:  " ) ;
        int input5 = scanner.nextInt();
        double[] pent = getPentagonalNumbers(input5 ) ;
        printArray( "First "+ input5 +" pentagonal numbers: " , pent);
        System.out.println("\n");

        System.out.println("Count Future investment");
        getInterestRate(1000, 10, 5 );
        System.out.println("\n");

        System.out.print("insert year to find out is it leap year or not: ");
        int year = scanner.nextInt();
        System.out.println("Is year leap: " + isLeapYear(year));
        System.out.println("\n");

        System.out.println( "1. A password must have at least eight characters.") ;
        System.out.println( "2. A password consists of only letters and digits.") ;
        System.out.println( "3. A password must contain at least two digits") ;

        System.out.print( "Input a password to validate: ");
        String password =sc.nextLine(); ;
        System.out.println(validatePassword(password));
        System.out.println("\n");

        /*Triangle Area*/
        System.out.println( "Count triangle Area."  );
        System.out.println( "sum of 2 sides must be greater then the 3-rd side."  );
        System.out.print( "Insert triangle side1:"  );
        double triangleSide1 = scanner.nextDouble();
        System.out.print( "Insert triangle side2:"  );
        double triangleSide2 = scanner.nextDouble();
        System.out.print( "Insert triangle side1:"  );
        double triangleSide3 = scanner.nextDouble();
        System.out.print( "Area of triangle:" + triangleArea(triangleSide1, triangleSide2, triangleSide3) );
        System.out.println("\n");

        System.out.println("Input number to find the amount of digits '2': ");
        System.out.println(countOfNumberTwo( scanner.nextInt()));
        System.out.println("\n");

    }

    public static int SmallestNumber( int a, int b, int c  )
    {
        if( a<=b && a<=c )
            return a;
        else if(b<=a && b<=c)
            return b;
        else
            return  c;
    }
    public static double AvarageNumber( int a, int b, int c  )
    {
        return (a+b+c)/3 ;
    }

    public static Character MiddleChar( String str)
    {
        return str.charAt( Math.round( str.length()/2) );
    }

    public static String FindVowels( String str)
    {
        final Character[] vowels = new Character[]{ 'A', 'a', 'E','e', 'I', 'i', 'O', 'o','U', 'u', 'Y', 'y'};
        String strOut = "" ;

        for(int i=0; i<str.length(); i++)
        {
            for(int j=0; j< vowels.length;j++)
            {
                if (str.charAt(i) == vowels[j] )
                    strOut = strOut + str.charAt(i) + " " ;
            }
        }
        return strOut ;
    }


    public static int CountOfWords( String str)
    {
        int count = (str.length()>0) ? 1:0 ;

        for(int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == ' ' )
                count++ ;
        }
        return count ;
    }

    public static int SumOfDigits( int input)
    {
        String str = String.valueOf(input);
        int sum = 0;
        for(int i=0; i<str.length();i++ )
        {
            sum += Integer.parseInt( String.valueOf( str.charAt(i) )  ) ;
        }
        return sum ;
    }

    public  static int nested( int[] nums)
    {
        int maxCountOfSteps =0;
        for(int i= 0 ;i < nums.length; i++ )
        {
            int currentNumber = nums[i];
            int otherNumber = currentNumber;
            int countOfSteps = 1;
            while( currentNumber != nums[otherNumber])
            {
                otherNumber = nums[otherNumber] ;
                countOfSteps++;
            }
            if (countOfSteps>maxCountOfSteps)
            {
                maxCountOfSteps = countOfSteps ;
            }
        }
        return maxCountOfSteps;
    }

    public static double[] getPentagonalNumbers(int n)
    {
        double[] pentagonals = new double[n+1];
        for(int i=1; i<=n ;i++)
            pentagonals[i] = (3* Math.pow(i,2) - i )/2 ;
        return pentagonals;
    }

    public static void getInterestRate( int investment, double annualRate, int years)
    {
        double monthRate = annualRate/12;
        double futureValue = investment ;
        for(int i=1; i<=years; i++)
        {
            for (int j=0; j<12; j++)
            {
                futureValue= futureValue+ (futureValue *monthRate/100);
            }
            System.out.println( i + "year futur investment: " + futureValue);
        }
    }

    public static boolean isLeapYear(int year)
    {
        if(year%4==0)
            return true;
        return false;
    }

    public static boolean validatePassword( String password)
    {

        if(password.length() < 10)
            return false;

        int characterCount = 0;
        int digitsCount = 0;

        for(int i=0; i<password.length(); i++ )
        {
             int asciiCode = password.charAt(i)   ;
             if( ( asciiCode >= 65 && asciiCode<= 90 ) || (asciiCode >= 97 && asciiCode<= 122) )
                 characterCount++;
             else if (asciiCode>=47 && asciiCode<=57 )
                 digitsCount++ ;
             else
                 return false ;
        }

        if(characterCount>= 8 && digitsCount>=2)
            return true;

        return false;

    }


    public static void printArray( String  text, double[] ar )
    {
        System.out.print(text + " ");
        for(int i=0; i<ar.length ; i++ )
        {
            System.out.print(ar[i] + " , ");
        }
        System.out.println("\n");
    } ;

    public static double triangleArea( double a, double b , double c)
    {
        if(a+b < c || b+c<a || a+c< b)
            return 0 ;
        /*Based on Heron formula*/
        return Math.sqrt( (a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c) ) /4  ;
    }

    public static int countOfNumberTwo(int number)
    {
        String str = String.valueOf(number);
        int cnt=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '2')
                cnt++;
        }
        return cnt;
    }
}