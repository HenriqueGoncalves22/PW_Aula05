public class Corrente extends Conta {
    private double limite;

    public double getLimite() {return limite;}
    public void setLimite(double limite) {this.limite = limite;}

    @Override
    public String debitar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return consultarSaldo();
        }
        else if(valor <= saldo + limite) {
            double debito = (saldo + limite) - valor;
            saldo -= valor;
            return "Saldo Insuficiente! Uso do limite especial em andamento." + consultarSaldo();
        }
        else {
            return "Saldo Insuficente!" + consultarSaldo();
        }
    }
    public void atualizarSaldo(){
        double juros;
        if(saldo < 0){
            juros = 8*(-saldo)/100;
            saldo = - (-saldo) + juros;
        }

    }

}
