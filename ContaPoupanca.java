public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;
    private double saldo;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public double getSaldo() {
        return this.saldo + (this.taxaDeJuros * this.saldo * (0.05 * this.diaAniversario));
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }
}
