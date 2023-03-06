package hilos_sincronizacion;

public class ClasePrincipal {
    public static void main(String[] args) {
        HiloUno hilo_uno = new HiloUno();
        HiloDos hilo_dos = new HiloDos();
        HiloTres hilo_tres = new HiloTres();
        HiloCuatro hilo_cuatro = new HiloCuatro();

        // Hilo 1
        hilo_uno.start();
        try {
            hilo_uno.sleep(10);
        } catch(InterruptedException e) {
            System.out.println("Error en el hilo uno " + e);
        }

        // Hilo 2
        hilo_dos.start();
        try {
            hilo_dos.sleep(10);
        } catch(InterruptedException e) {
            System.out.println("Error en el hilo dos " + e);
        }

        // Hilo 3
        hilo_tres.start();
        try {
            hilo_tres.sleep(10);
        } catch(InterruptedException e) {
            System.out.println("Error en el hilo tres " + e);
        }

        // Hilo 4
        hilo_cuatro.start();
        try {
            hilo_cuatro.sleep(10);
        } catch(InterruptedException e) {
            System.out.println("Error en el hilo cuatro " + e);
        }
    }
}
