package day07;

public class LogicalNotOperator {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);

        int n = 100;
        boolean even = n % 2 == 0;
        boolean add = !even;

        System.out.println("even = " + even);
        System.out.println("add = " + add);

    }
}
