import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        double[] input = {20.0, 40.0};

        double valorTotal = Arrays.stream(input).sum();
        double menorValor = Math.min(input[0], input[input.length - 1]);
        double desconto = input[0] - (input[0] * 0.5);
        double totalPagar = valorTotal - desconto;
        String resultado = "Valor total: " + valorTotal + " | Valor de descontos: " + desconto + " | Valor a pagar: " + totalPagar;
        System.out.println(resultado);
        System.out.println(menorValor);
    }
}
