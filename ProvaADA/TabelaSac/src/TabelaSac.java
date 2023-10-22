import java.util.Scanner;

public class TabelaSac {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double TempoPagamento = 0.0;
        double juros_mensal = 0.0;
        double parcela_mensal = 0.0;
        double saldo_devedor = 0.0;

        System.out.println("valor do Emprrestimo:");
        double ValorDoEmprestimo = leitor.nextDouble();
        System.out.println(ValorDoEmprestimo);
        System.out.println("Numero de Parcelas:");
        int NumeroParcelas = leitor.nextInt();
        System.out.println("Taxa de Juros do Empréstimo:");
        double TaxaJurosEmprestimo = leitor.nextDouble();

        System.out.println("Tempo para pagamento:");

        System.out.printf("Valor do Empréstimo: %s", ValorDoEmprestimo);
        System.out.printf("%s meses", NumeroParcelas);
        System.out.printf("Com juros de %s", TaxaJurosEmprestimo);

        parcela_mensal = ValorDoEmprestimo / NumeroParcelas;

        for (int i = 1; i <= NumeroParcelas; i++) {
            parcela_mensal = parcela_mensal + TaxaJurosEmprestimo;
            saldo_devedor = ValorDoEmprestimo - parcela_mensal;

            System.out.println("Parcela %s juros R$ " + juros_mensal + " Prestação R$ " + parcela_mensal + "  Saldo Devedor R$ " + saldo_devedor);
        }
    }
}
