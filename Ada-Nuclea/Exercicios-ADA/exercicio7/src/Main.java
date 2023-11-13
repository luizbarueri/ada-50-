import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double[] input = {1.00, 72544.00, 1820.00, 124.00};

        double numeroCarrosVendidos = input[0]; //3
        double valorVendasMes = input[1]; //20.000,00
        double salarioFixo = input[2]; //2.000,00
        double valorFixoPorCarro = input[3]; //250,00

        double valorFixoCarrMes = numeroCarrosVendidos * valorFixoPorCarro;
        double comissao = valorVendasMes * 0.05;

        double salario = salarioFixo + valorFixoCarrMes + comissao;

        BigDecimal bd = new BigDecimal(salario).setScale(2, RoundingMode.HALF_UP);
        double val2 = bd.doubleValue();

        System.out.println(val2);

        //return val2;
    }
}