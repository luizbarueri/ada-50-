public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int input[] = {4, 2, 3};
        int a = input[0];
        int b = input[1];
        int c = input[2];

        double hipotenusa = a;

        if (hipotenusa < b) {
            hipotenusa = b;
        }

        if (hipotenusa < c) {
            hipotenusa = c;
        }
        boolean triangulo = false;
        if ((a + b + c - hipotenusa) > hipotenusa) {
            triangulo = true;
        }

        System.out.println("É um triangulo? " + a + ", " + b + ", " +  c + " = " + triangulo);

    }
}