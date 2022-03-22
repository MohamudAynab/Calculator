package JavaCalculator;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);

    public void mathOptions() {
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square");

    }

    public double add() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter the first value");
        a = scan.nextDouble();
        System.out.println("Enter second value");
        b = scan.nextDouble();
        double value = a + b;

        return value;

    }

    public double subtract() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a  = scan.nextDouble();
        System.out.println("Enter second value");
        b = scan.nextDouble();
        double value = a - b;

        return value;

    }

    public double multiply() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter second value");
        b = scan.nextDouble();
        double value = a * b;

        return value;

    }

    public double divide() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter second value");
        b = scan.nextDouble();
        double value = a / b;

        return value;

    }

    public double square() {
        scan.useLocale(Locale.US);
        double a, b;
        System.out.println("Enter first value");
        a = scan.nextDouble();
        System.out.println("Enter second value");
        b = scan.nextDouble();
        double value = a * a;

        return value;

    }


}
