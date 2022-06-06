import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        double entrada;
        int entrada2;
        Scanner scanner = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
        System.out.println("=== Conta corrente criada com sucesso! ===");
        System.out.println("Saldo em conta corrente: R$ " + cc1.getSaldo() + " mais limite de R$ " + cc1.getChequeEspecial() + " para cheque especial.");
        do {
            System.out.print("Quanto quer sacar? (Digite 0 para cancelar) R$ ");
            entrada = scanner.nextDouble();
            cc1.setSacar(entrada);
            if (entrada != 0) {
                System.out.println("Após o saque, o saldo atual é de R$ " + cc1.getSaldo() + " mais limite de R$ " + cc1.getChequeEspecial() + " para cheque especial.");
            } else {
                System.out.println("Fim da operação de saque.");
                System.out.println("");
            }
        } while (entrada !=0);
        do {
            System.out.print("Quanto quer depositar? (Digite 0 para cancelar) R$ ");
            entrada = scanner.nextDouble();
            cc1.setDepositar(entrada);
            if (entrada != 0) {
                System.out.println("Após o depósito, o saldo atual é de R$ " + cc1.getSaldo());
            } else {
                System.out.println("Fim da operação de depósito.");
                System.out.println("");
            }
        } while (entrada != 0);

        ContaSalario cs1 = new ContaSalario(101, 2, "Banco DD", 500.00, 2);
        System.out.println("=== Conta salário criada com sucesso! ===");

        do {
            System.out.println("O saldo na conta salário é de R$ " + cs1.getSaldo());
            System.out.println("Qtde. de saque disponível: " + cs1.getLimiteSaque());
            System.out.print("Quanto quer sacar? R$ ");
            entrada = scanner.nextDouble();
            cs1.setSacar(entrada);
        } while (cs1.getLimiteSaque() > 0);

        ContaPoupanca cp1 = new ContaPoupanca(62, 1, "Banco BB", 0, 1, 0.1);
        System.out.println("");
        System.out.println("=== Abertura da Conta poupança ===");
        System.out.print("Informe o saldo inicial: R$ ");
        entrada = scanner.nextDouble();
        cp1.setSaldo(entrada);
        //System.out.println("Saldo inicial da Conta Poupança - R$ " + cp1.getSaldo());
        System.out.print("Informe o dia de criação da poupança para estimar o rendimento: ");
        entrada2 = scanner.nextInt();
        cp1.setDiaAniversario(entrada2);
        System.out.println("Conforme cálculos, com o saldo inicial de R$ " + entrada + " com a atual taxa de juros de " +
                cp1.getTaxaDeJuros() + "% e com o dia de aniversário em " + cp1.getDiaAniversario() +
                ", o saldo será de R$ " + cp1.getSaldo());
        System.out.println("");
    }
}
