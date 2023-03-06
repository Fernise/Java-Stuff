package hilos_sincronizacion;

public class HiloDos extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; ++i) {
            System.out.print("E");
            try {
                HiloDos.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Error en la clase HiloDos " + e);
            }
        }
    }
}
