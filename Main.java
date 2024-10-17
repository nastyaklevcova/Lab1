import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        if (b == 0) {
            System.out.println("Решений нет");
        } else {
            if (a < 0) {
                if (b < 0) {
                    System.out.println("Решение: x ∈ (-∞, " + b + "] ∪ (0, +∞)");
                } else {
                    System.out.println("Решение: x ∈ (-∞, 0] ∪ (" + b + ", +∞)");
                }
            } else if (a > 0) {
                if (b < 0) {
                    System.out.println("Решение: x ∈ [" + b + ", 0]");
                } else {
                    System.out.println("Решение: x ∈ [0, " + b + ")");
                }
            } else {
                // Если a == 0, это отдельный случай
                System.out.println("Решение: x ∈ R, кроме " + b);
            }
        }
    }
}