package SistemaFinTech;

public class Lanzador {
    public static void main(String[] args) throws InterruptedException {

        Cuenta cuenta = new Cuenta(10000); //el saldo inicial es de 10000 euros

        Thread[] hilos = new Thread[2000];

        for (int i = 0; i < 400; i++) {
            hilos[i] = new Thread(new HiloCliente(cuenta, 100, true)); //deposito de 100 euros
            hilos[i+400] = new Thread(new HiloCliente(cuenta, 100, false));
        }

        for (int i = 800; i < 1000; i++){ //400+400 --> 800
            hilos[i] = new Thread(new HiloCliente(cuenta, 50, true)); //deposito de 50 euros
            hilos[i+200] = new Thread(new HiloCliente(cuenta, 50, false));
        }

        for (int i = 1200; i < 1800; i++){ //1000+200-->1200
            hilos[i] = new Thread(new HiloCliente(cuenta, 20, true)); //deposito de 20 euros
            hilos[i+600] = new Thread(new HiloCliente(cuenta, 20, false));
        }

        for (Thread hilo: hilos) { //inicio de todos los hilos
            hilo.start();
        }

        for (Thread hilo: hilos){ //espera a que todos los hilos terminen
            hilo.join();
        }









    }


}
