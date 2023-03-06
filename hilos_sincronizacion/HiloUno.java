package hilos_sincronizacion;

public class HiloUno extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; ++i) {
            System.out.print(i + ": G");
            try {
                HiloUno.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error en la clase HiloUno " + e);
            }
        }
    }
}
