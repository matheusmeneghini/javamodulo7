public class ContaCorrente extends Conta{
    private double chequeEspecial;
    private double sacar;
    private double depositar;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.sacar = sacar;
        this.depositar = depositar;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }
    @Override
    public double getSaldo(){
        return this.chequeEspecial + this.saldo;
    }

    public double setSacar(double sacar) {
        if (sacar > getSaldo()) {
            return 0;
        } else {
            return this.saldo -= sacar;
        }
    }
}
