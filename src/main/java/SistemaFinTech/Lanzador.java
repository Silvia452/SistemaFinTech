package SistemaFinTech;

public class Lanzador {
    public static void main(String[] args) {
        final int NUM_CLIENTES = 100;
        final int SALDO_INICIAL = 10000;

        Cuenta cuenta = new Cuenta(SALDO_INICIAL);
        HiloCliente[] cliente = new HiloCliente[NUM_CLIENTES];
        Thread[] hilosAsociados = new Thread[NUM_CLIENTES];





    }


}
