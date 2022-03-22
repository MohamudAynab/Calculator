package JavaCalculator;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        System.out.println("Select operation (+, -, *, /, ^): ");
        char option = scanner.next().charAt(0);

        scanner.close();
        double result;

        switch(option) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '^':
                result = num1 * num1;
                break;

            default:
                System.out.println("Incorrect selection. Please try again.");
                return;
      }

      System.out.println(num1+" "+option+" "+num2+": "+result);

    }
}