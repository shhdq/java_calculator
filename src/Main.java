import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // skaitlis 1
        System.out.println("Ievadi pirmo skaitli: ");
        double x = scanner.nextDouble();

        // skaitlis 2
        System.out.println("Ievadi otro skaitli: ");
        double y = scanner.nextDouble();

        // operators
        System.out.println("Izvēlies operatoru (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        // rezultats
        double res = 0;

        switch (op) {
            case '+':
                res = sum(x, y);
                break;
            case '-':
                res = sub(x, y);
                break;
            case '*':
                res = mult(x, y);
                break;
            case '/':
                if (y != 0) {
                    res = div(x, y);
                } else {
                    System.out.println("Dalīšana ar nulli nav iespējama");
                    scanner.close();

                    return;
                }
                break;
            default:
                System.out.println("Nederīgs operators!");
                scanner.close();

        }

        System.out.println("Rezultāts: " + res);

        scanner.close();


    }

    // sum
    public static double sum(double x, double y) {
        return x + y;
    }

    // sub
    public static double sub(double x, double y) {
        return x - y;
    }

    // mult
    public static double mult(double x, double y) {
        return x * y;
    }

    // sum
    public static double div(double x, double y) {
        return x / y;
    }



}