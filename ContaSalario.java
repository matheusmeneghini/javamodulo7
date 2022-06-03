public class ContaSalario  extends Conta{
    private int limiteSaque;
    private int qtdeSaque = 0;
    private double sacar;
    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public double getSacar() {
        return super.getSacar();
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }


    public void setLimiteSaque() {
        this.limiteSaque--;
    }

    public double setSacar(double sacar) {

        if (this.limiteSaque > 0) {
            if (sacar > getSaldo()) {
                return 0;
            } else {
                setLimiteSaque();
                return this.saldo -= sacar;
            }
        } else {
            return 0;
        }
    }
}
