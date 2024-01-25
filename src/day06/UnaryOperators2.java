package day06;

public class UnaryOperators2 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(n++);   // 30 post increment
        System.out.println(n--);   // 31 post decrement
        System.out.println(n--);   // 30 post decrement
        System.out.println(n--);   // 29 post decrement
        System.out.println(n--);   // 28 post decrement
        System.out.println(n);     // 27 post decrement
        System.out.println(n++);   // 27 post increment +1 on hold for the next sout
        System.out.println(n--);   // 28 post decrement -1 will count for the next sout
        System.out.println(n);     // 27
    }
}
