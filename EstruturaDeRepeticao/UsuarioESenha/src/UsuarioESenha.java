import java.util.Scanner;

public class UsuarioESenha {
    //Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do
    // usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "";
        String senha = "";

        while ( nome.equals(senha) ) {
            System.out.println("Digite o nome do Usuário:");
            nome = leitor.next();
            System.out.println("Digite uma Senha:");
            senha = leitor.next();

            if (nome.equals(senha)) System.out.println("Senha não pode ser igual ao nome do Usuário!");
        }
        System.out.println("Usuario e Senha Válidos");

        leitor.close();
    }
}
