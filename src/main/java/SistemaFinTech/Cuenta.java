package SistemaFinTech;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;

    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
}
