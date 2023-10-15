import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio:");
        Double raio = Double.valueOf(sc.next());
        Double area = 3.14 * Math.pow(raio, 2);
        System.out.println("Área do Circulo = " + area);


    }
}
