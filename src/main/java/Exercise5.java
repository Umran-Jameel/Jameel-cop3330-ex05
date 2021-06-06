import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String n1 = in.nextLine();
        System.out.print("What is the second number? ");
        String n2 = in.nextLine();

        int first = Integer.parseInt(n1);
        int second = Integer.parseInt(n2);

        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        int div = first / second;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n", first, second, add, first, second, sub, first, second, mult, first, second, div);

    }
}
