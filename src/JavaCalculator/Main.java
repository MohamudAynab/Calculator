package JavaCalculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int x;
        double score;
        calculator.mathOptions();
        x = scan.nextInt();

        switch (x) {
            case 1:
                score = calculator.add();
                System.out.println(score);
                break;
            case 2:
                score = calculator.subtract();
                System.out.println(score);
                break;
            case 3:
                score = calculator.multiply();
                System.out.println(score);
                break;
            case 4:
                score = calculator.divide();
                System.out.println(score);
                break;
            case 5:
                score = calculator.square();
                System.out.println(score);
                break;
            default:
                System.out.println("Incorrect selection.Try again");
        }
    }
}
