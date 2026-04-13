package comcompany;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1-Line Calculator ===");
        System.out.print("Enter expression (e.g., 10+5): ");

        String input = sc.nextLine();

        // Split numbers and operator
        double num1 = 0, num2 = 0;
        char operator = ' ';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;

                num1 = Double.parseDouble(input.substring(0, i));
                num2 = Double.parseDouble(input.substring(i + 1));

                break;
            }
        }

        double result = 0;

        switch (operator) {
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
            default:
                System.out.println("Invalid input!");
                return;
        }

        System.out.println("Result: " + result);
    }
}