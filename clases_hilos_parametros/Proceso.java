package clases_hilos_parametros;

public class Proceso extends Thread {
    int num_uno = 0;

    // Constructor
    public Proceso(String nombre_hilo) {
        super(nombre_hilo);
    }

    @Override
    public void run() {
        for (int i = 0; i <= num_uno; ++i) {
            System.out.println(i + this.getName()); // Se obtiene el nombre del hilo
        }
        System.out.println("");
    }

    public void ValorCondicion(int valor) {
        this.num_uno = valor;
    }
}