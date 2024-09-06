public class Poupanca extends Conta{
    private double reajusteMensal;

    public double getReajusteMensal() {return reajusteMensal;}
    public void setReajusteMensal(double reajusteMensal) {this.reajusteMensal = reajusteMensal;}

    public void atualizarSaldo(){
        saldo = saldo + reajusteMensal;
    }


}
