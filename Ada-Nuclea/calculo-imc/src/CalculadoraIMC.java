import java.util.Scanner;

public class CalculadoraIMC {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public static double calcularPesoIdeal(double altura) {
        // Fórmula genérica para peso ideal. Pode ser ajustada conforme necessário.
        return 24.90 * (altura * altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);
        double pesoIdeal = calcularPesoIdeal(altura);

        // Exibir resultados
        System.out.println("\nResultados:");
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Peso Ideal: " + pesoIdeal);

        // Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
