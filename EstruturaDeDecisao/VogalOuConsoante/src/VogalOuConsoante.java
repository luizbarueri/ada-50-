import java.util.Scanner;

public class VogalOuConsoante {
    //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] ListaLetras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "w","z"};
        boolean consoante = false;
        boolean vogal = false;

        System.out.println("Digite uma letra de A até Z");

        String letra = leitor.next().toLowerCase();
        //procura a letra na lista de Vogal
        for (int i = 0; i < ListaLetras.length; i++) {
            if (letra.equals("a")  ||
                    letra.equals("e") ||
                    letra.equals("i") ||
                    letra.equals("o") ||
                    letra.equals("u")) {
                vogal = true;
            } else if (letra.equals(ListaLetras[i])) {
                consoante = true;
            }
        }

        if ( vogal == true ) {
            System.out.printf("A letra digitada %s é uma Vogal", letra.toUpperCase());
        } else if ( consoante == true ){
            System.out.printf("A letra digitada %s é uma Consoante", letra.toUpperCase());
        } else if (vogal == false && consoante == false) {
            System.out.printf("A letra %s não é Vogal nen Consoante!", letra);
        }

    }
}
