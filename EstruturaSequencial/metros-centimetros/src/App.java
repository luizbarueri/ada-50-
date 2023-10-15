import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor em metros:");
        Double metros = Double.valueOf(sc.next());
        Double centimetros = metros * 100;
        System.out.println(metros + " metros, em  centimetros = : " + centimetros);
    }
}
