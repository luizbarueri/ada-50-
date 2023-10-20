import java.util.Scanner;

public class LetraFouM {
    public static void main(String[] args) {
        //Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        // Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite F ou M:");
        String letra = leitor.next().toUpperCase();
        if (letra.equals("F")) {
            System.out.printf("%s - Feminino", letra);
        } else if (letra.equals("M")) {
            System.out.printf("%s - Masculino", letra);
        } else {
            System.out.println("Sexo Inválido.");
        }
    }
}
