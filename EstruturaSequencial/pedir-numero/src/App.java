import java.util.Scanner; // import the Scanner class 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        String numero;
        
        // Enter username and press Enter
        System.out.println("Entre com um número Inteiro:");
         
        numero = myObj.nextLine();
        try {
            //int valor = Integer.parseInt(numero);
            int valor = Integer.valueOf(numero);
            System.out.println("É um Numero Inteiro válido: " + valor);

        } catch (Exception e) {
            // TODO: handle exception
             System.out.println("Não é um numero Inteiro: " + numero);
        }   
    }
}
