import java.util.Scanner;

public class CalcularMedia {
    //Faça um programa para a leitura de duas notas parciais de um aluno.
    // O programa deve calcular a média alcançada por aluno e apresentar:
    //-A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    //-A mensagem "Reprovado", se a média for menor do que sete;
    //-A mensagem "Aprovado com Distinção", se a média for igual a dez.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2;
        System.out.println("Digite nota 1:");
        nota1 = leitor.nextDouble();
        System.out.println("Digite nota 2:");
        nota2 = leitor.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f", media);

        if (media >= 7) System.out.println(" Aprovado");
        if (media < 7) System.out.println(" Reprovado");
        if (media == 10) System.out.println(" Aprovado com Distinção");

    }
}
