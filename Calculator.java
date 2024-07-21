import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Choose operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+': System.out.println("Result: " + (num1 + num2)); break;
                case '-': System.out.println("Result: " + (num1 - num2)); break;
                case '*': System.out.println("Result: " + (num1 * num2)); break;
                case '/': 
                    if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                    else System.out.println("Cannot divide by zero!");
                    break;
                default: System.out.println("Invalid operation.");
            }
            System.out.println("Continue? (y/n): ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n') break;
        }
        scanner.close();
    }
}
