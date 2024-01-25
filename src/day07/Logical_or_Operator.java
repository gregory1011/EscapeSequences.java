package day07;

public class Logical_or_Operator {
    public static void main(String[] args) {
        /*
        An integer variable name month is given
        Write a program that can check if the month has 30 days in it

           Months having 30 days is a year are
           April (4)
           June (6)
           September (9)
           November (11)

         */
             int month = 9;
             boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        System.out.println("has30days = " + has30days);  // true
        System.out.println("------------------");
        int months =2;
        boolean has31days = months == 4 || months == 6 || months == 9 || months == 11;
        System.out.println("has31days = " + has31days);   // false



    }
}
