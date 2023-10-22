import java.util.Scanner;

public class NotaEntreZeroEDez {
    //Faça um programa que peça uma nota, entre zero e dez.
    // Mostre uma mensagem caso o valor seja inválido e continue pedindo
    // até que o usuário informe um valor válido.
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       int nota = 0;
       while (nota < 1 || nota > 9) {
           System.out.println("Digite uma nota maior que Zero e Menor que 10:");
           nota = leitor.nextInt();
           if (nota < 1 || nota > 9 ) {
               System.out.println("Nota inválida! tente novamente!");
           }
       }

       System.out.println("Nota válida:" + nota);
       leitor.close();
    }
}
