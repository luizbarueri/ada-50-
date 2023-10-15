import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1");
        Double nota1 = Double.valueOf(sc.next());

        System.out.println("Nota 2");
        Double nota2 = Double.valueOf(sc.next());

        System.out.println("Nota 3");
        Double nota3 = Double.valueOf(sc.next());

        System.out.println("Nota 4");
        Double nota4 = Double.valueOf(sc.next());

        System.out.println("A media das 4 notas é: " + (nota1 + nota2 + nota3 + nota4) / 4);
    }
}
