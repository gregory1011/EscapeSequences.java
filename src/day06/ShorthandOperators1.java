package day06;

public class ShorthandOperators1 {
    public static void main(String[] args) {
        // example 1 increase value
        int x = 100;                  // old value
        System.out.println(x);        // 100
        x = 200;                      // increased positive value
        System.out.println(x);        // 200 new value
        int salary = 1000;           // old value
        System.out.println(salary);   // 1000
        salary += 100;              // increased positive value with 100
        System.out.println(salary);  // new value 1100
        // example increase value
        int sqf = 300;
        sqf += 75;
        System.out.println(sqf); // 375
       System.out.println("----------------------------------------");
       // example 2 decrease value
        int y = 200;
        System.out.println(y); // 200
        y -= 110;
        System.out.println(y); // 90
        // example 3 decrease value
        double price = 10.5;
        price -= 5.5;
        System.out.println(price); // 5.0



    }
}