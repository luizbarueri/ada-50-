import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para X:");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Digite outro numero para Y:");
        int y = sc.nextInt();
        System.out.println("A soma de x(" + x + ") + y(" + y + ") é: " + (x + y));
    }
}
