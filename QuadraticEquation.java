import java.util.Scanner;

public class QuadraticEquation {

    public static double solveEquation(int a, int b, int c) throws Exception {
        int discriminant = b * b - 4 * a * c;
        int a2 = a * 2;
        if (a == 0) {
            throw new Exception("Коефiцiєнт 'a' не може дорiвнювати 0.");
        }

        if (discriminant == 0) {
            double x = -b / a2;
            System.out.println("Корень рiвняння: " + x);
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / a2;
            double x2 = (-b - Math.sqrt(discriminant)) / a2;
            System.out.println("Коренi рiвняння: x1 = " + x1 + " x2 = " + x2);
        } else if (discriminant < 0) {
            throw new Exception("Рiвняння не має дiйсних коренiв");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введiть коефiцiєнт а: ");
        int a = input.nextInt();
        System.out.println("Введiть коефiцiєнт b: ");
        int b = input.nextInt();
        System.out.println("Введiть коефiцiєнт c: ");
        int c = input.nextInt();
        input.close();

        try {
            solveEquation(a, b, c);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
