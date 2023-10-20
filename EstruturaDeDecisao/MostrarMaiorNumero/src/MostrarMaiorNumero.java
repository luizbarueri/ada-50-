import java.util.Scanner;

public class MostrarMaiorNumero {
    //Faça um Programa que leia três números e mostre o maior deles.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int maior = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite um numero:");
            numero = leitor.nextInt();
            if (numero > maior) maior = numero;
        }
        System.out.printf("O maior número é %s", maior);
        leitor.close();
    }
}
