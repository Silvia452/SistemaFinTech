package SistemaFinTech;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;
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
