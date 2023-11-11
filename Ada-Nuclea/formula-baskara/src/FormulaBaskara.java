import java.lang.Math;

public class FormulaBaskara {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x1 = -b / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Raízes complexas, não é possível calcular em Java.");
        }
    }
}
