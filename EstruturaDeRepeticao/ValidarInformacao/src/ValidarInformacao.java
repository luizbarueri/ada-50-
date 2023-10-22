import java.util.Scanner;

public class ValidarInformacao {
    //Nome: maior que 3 caracteres;
    //Idade: entre 0 e 150;
    //Salário: maior que zero;
    //Sexo: 'f' ou 'm';
    //Estado Civil: 's', 'c', 'v', 'd';
    public static void main(String[] args) {
        String nome = "";
        int idade = 0;
        double salario = 0;
        String sexo = "";
        String estadoCivil = "";

        Scanner leitor = new Scanner(System.in);

        while ( nome.length() <= 3 ) {
            System.out.println("Nome:");
            nome = leitor.next();
        }

        while (idade < 1 || idade > 149) {
            System.out.println("Idade:");
            idade = leitor.nextInt();
        }
        while ( !sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Sexo:");
            sexo = leitor.next().toLowerCase();
        }
        while ( !estadoCivil.equals("s") &&
                !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") &&
                !estadoCivil.equals("d")) {
            System.out.println("Estado Civil:");
            estadoCivil = leitor.next().toLowerCase();
        }

        System.out.println("Válidado com sucesso!");
        leitor.close();
    }
}