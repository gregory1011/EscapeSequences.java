package day06;

public class ArithmeticOperator2 {
    public static void main(String[] args) {
       /*
       In math: real life example is   20 / 3 = 6.666...
       reminder = numerator - ( denominator * integer result)
              // numerator= 20 : denominator= 3 : integer value = 6
       reminder = 20 - (3 * 6)      // result = 18
       reminder = 20 - 18          // result = 2
       reminder = 2

      In Java: real example:
       reminder = 20 % 3
       reminder = 2

        */

        System.out.println(40 / 9.0);
        System.out.println(40 % 9);
        System.out.println(10 % 2); // is evenly divisible by 2


    }
}
