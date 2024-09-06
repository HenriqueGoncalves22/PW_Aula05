public abstract class Conta {
    protected double saldo;

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public String consultarSaldo(){
        return "R$ "+ saldo;
    }
    public String creditar(double valor){
        this.saldo += valor;
        return consultarSaldo();
    }
    public String debitar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return consultarSaldo();
        }
        else{
            return "Saldo Insuficiente!" + consultarSaldo();
        }
    }
}
