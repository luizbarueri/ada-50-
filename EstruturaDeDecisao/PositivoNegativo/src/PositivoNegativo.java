import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();
        if (numero > 0) {
            System.out.printf("O número %s é Positivo", numero);
        } else if(numero < 0) {
            System.out.printf("O número %s é Negativo", numero);
        } else if (numero == 0) {
            System.out.println("Zero não é Positivo nem Negativo!");
        }
    }
}
