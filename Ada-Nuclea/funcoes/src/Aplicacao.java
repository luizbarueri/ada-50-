import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("Data de nascimento:");
        String dataNascimento = input.nextLine();
        System.out.println("Endereço (logradouro, número, bairro, cidade, estado):");
        String endereco = input.nextLine();
        System.out.println("Complemento:");
        String complemento = input.nextLine();
        System.out.println("Profissão:");
        String profissao = input.nextLine();
        System.out.println("E-mail:");
        String email = input.nextLine();
        System.out.println("Telefone:");
        String telefone = input.nextLine();
        System.out.println("Pessoa { "
                + "nome = "+ nome
                + "Data de nascimento: = "+ dataNascimento
                + "Endereço = "+ endereco
                + "Complemento = "+ complemento
                + "Profissão = "+ profissao
                + "E-mail = "+ email
                + "Telefone = "+ telefone
                +" }");
    }
}