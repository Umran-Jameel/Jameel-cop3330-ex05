import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String n1 = in.nextLine();
        System.out.print("What is the second number? ");
        String n2 = in.nextLine();

        double first = 0;
        double second =  0;

        // challenge dont let user continue without entering numerica value
        try {
            first = Double.parseDouble(n1);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        try {
            second = Double.parseDouble(n2);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value!");
            System.exit(0);
        }

        // challenge no negative numbers
        if (first < 0 || second < 0) {
            System.out.println("Please enter a positive numeric value!");
            System.exit(0);
        }

        double add = addition(first, second);
        double sub = subtraction(first, second);
        double mult = multiplication(first, second);
        double div = division(first, second);

        System.out.printf("%.2f + %.2f = %.2f\n%.2f - %.2f = %.2f\n%.2f * %.2f = %.2f\n%.2f / %.2f = %.2f\n", first, second, add, first, second, sub, first, second, mult, first, second, div);
    }

    // challenge break up into functions
    public static double addition(double first, double second) {
        return first + second;
    }

    public static double subtraction(double first, double second) {
        return first - second;
    }

    public static double multiplication(double first, double second) {
        return first * second;
    }

    public static double division(double first, double second) {
        return first / second;
    }
}
