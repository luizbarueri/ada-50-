import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado = dividir();
        if ( resultado > 0) {
            System.out.println(resultado);
        } else {
            System.out.println("Não existe divisão por 0 (zero)!");
        }
    }

    public static double  dividir() {
        Scanner leitor = new Scanner((System.in));
        System.out.println("Digite um numero:");
        double a = leitor.nextDouble();
        System.out.println("Digite outro numero:");
        double b = leitor.nextDouble();
        if (b > 0) return a / b; else return  0.0;
    }
}