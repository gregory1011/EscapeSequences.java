package day07;

public class LogicalAndOperator {

    public static void main(String[] args) {
        /*
        write a program if a person is eligible for a loan.
            Loan requirements:
               1. Credit score must be 650 or greater.
               2. Salary must be 40000 or greater.

         */
        int salary = 75000;
        int creditScore = 620;
        boolean isEligible = creditScore >= 650 && salary >= 40000;
             //                false           &&    true
        System.out.println("isEligible = " + isEligible);
              //              true      &&

        // another example
        int  age  = 40;
        int creditCards = 10;
        Boolean isCorrect =age <= 40 && creditCards <= 10;
                      //    true     &&  true
        System.out.println("isCorrect = " + isCorrect);


    }
}
