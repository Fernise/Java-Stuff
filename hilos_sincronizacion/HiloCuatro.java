package hilos_sincronizacion;

public class HiloCuatro extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; ++i) {
            System.out.println("K");
            try {
                HiloCuatro.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error en la clase HiloCuatro " + e);
            }
        }
    }
}