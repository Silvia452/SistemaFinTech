package SistemaFinTech;

public class Main {
    public static void main(String[] args) {
        try {
            Lanzador.main(args);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
