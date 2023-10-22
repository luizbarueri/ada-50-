import java.util.Scanner;

public class ConversorDeTemperatura {
    //C para Celsius, K para Kelvin ou F para grau Fahrenheit.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double C = 0.0;
        double K = 0.0;
        double F = 0.0;

        System.out.println("Informe a temperatura");
        double temperatura = leitor.nextDouble();
        //System.out.println(temperatura);
        System.out.println("Unidade de temperatura C/k/F:");
        String unidadeTemperatura = leitor.next().toLowerCase();
        if (unidadeTemperatura.equals("c") || unidadeTemperatura.equals("k") || unidadeTemperatura.equals("f")) {
            System.out.println("Unidade de temperatura Destino:");
            String unidadeTemperaturaDestino = leitor.next().toLowerCase();
            if (unidadeTemperaturaDestino.equals("c") || unidadeTemperaturaDestino.equals("k") || unidadeTemperaturaDestino.equals("f")) {
                //De C para K
                if (unidadeTemperatura.equals("c") && unidadeTemperaturaDestino.equals("k")) {
                    C = temperatura;
                    K = 273.15 + C;
                    System.out.printf("%s C para %.2f K", C, K);
                }
                //de C para F
                if (unidadeTemperatura.equals("c") && unidadeTemperaturaDestino.equals("f")) {
                    C = temperatura;
                    F = (C * 9 / 5) + 32;
                    System.out.printf("%.2f C para %.2f F", C, F);
                }
                //De K para C
                if (unidadeTemperatura.equals("k") && unidadeTemperaturaDestino.equals("c")) {
                    K = temperatura;
                    C = K - 273.15;
                    System.out.printf("%.2f K para %.2f C", K, C);
                }
                //de K para F
                if (unidadeTemperatura.equals("k") && unidadeTemperaturaDestino.equals("f")) {
                    K = temperatura;
                    C = K - 273.15;
                    F = (C * 9 / 5) + 32;
                    System.out.printf("%.2f K para %.2f F", K, F);
                }
                //De F para C
                if (unidadeTemperatura.equals("f") && unidadeTemperaturaDestino.equals("c")) {
                    F = temperatura;
                    C = (F - 32) * 5 / 9;
                    System.out.printf("%.2f F para %.2f C", F, C);
                }
                //De F para K
                if (unidadeTemperatura.equals("f") && unidadeTemperaturaDestino.equals("k")) {
                    F = temperatura;
                    C = (F - 32) * 5 / 9;
                    K = 273.15 + C;
                    System.out.printf("%.2f F para %.2f K", F, K);
                }
            } else {
                System.out.println("Unidade temperatura Destino Inválido!");
            }
        } else {
            System.out.println("Unidade de temperatura inválido!");
        }

        System.out.println();
        leitor.close();
    }
}
