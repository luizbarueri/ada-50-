import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima o maior deles.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = leitor.nextDouble();
        System.out.println(numero1);
        System.out.println("Digite o segundo número:");
        double numero2 = leitor.nextDouble();
        System.out.println(numero2);
        if (numero1 > numero2) {
            System.out.printf("O Numero %s é maior que número %s", numero1, numero2);
        } else if (numero2 > numero1) {
            System.out.printf("O Numero %s é maior que número %s", numero2, numero1);
        } else if (numero1 == numero2) {
            System.out.printf("O Numero %s é igual ao número %s", numero1, numero2);
        } else {
            System.out.printf("Erro ao comparar %s e %s", numero1, numero2);

        }

    }
}
