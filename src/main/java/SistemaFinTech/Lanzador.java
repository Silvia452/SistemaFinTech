package SistemaFinTech;

public class Lanzador {
    public static void main(String[] args) throws InterruptedException {

        Cuenta cuenta = new Cuenta(10000); //el saldo inicial es de 10000 euros
        int NUM_HILOS = 1200;
        Thread[] hilosDeposito = new Thread[NUM_HILOS];
        Thread[] hilosRetiro = new Thread[NUM_HILOS];

        for (int i = 0; i < 400; i++) {
            hilosDeposito[i] = new Thread(new HiloCliente(cuenta, 100, true)); //deposito de 100 euros
            hilosDeposito[i+400] = new Thread(new HiloCliente(cuenta, 50, true)); //deposito de 50 euros
            hilosDeposito[i+800] = new Thread(new HiloCliente(cuenta, 20, true));  //deposito de 20 euros

            hilosRetiro[i] = new Thread(new HiloCliente(cuenta, 100, false));
            hilosRetiro[i+400] = new Thread(new HiloCliente(cuenta, 50, false));
            hilosRetiro[i+800] = new Thread(new HiloCliente(cuenta, 20, false));
        }


        for (int i=0; i<1200; i++){ //inicio de todos los hilos
            hilosDeposito[i].start();
            hilosRetiro[i].start();
        }

        for(int i=0; i<1200; i++){ //espera a que todos los hilos terminen
            try{
                hilosDeposito[i].join();
                hilosRetiro[i].join();
            }
            catch(InterruptedException e){
                System.out.println("Error en la ejecución del hilo");
            }
        }




        double saldoFinal = cuenta.getSaldo();
        if (saldoFinal == 10000) {
            System.out.println("El saldo final es correcto");
            System.out.println("El saldo final es: " + saldoFinal);
        }else{
            System.out.println("El saldo final es incorrecto");
            System.out.println("El saldo final es: " + saldoFinal);
        }

    }
}
