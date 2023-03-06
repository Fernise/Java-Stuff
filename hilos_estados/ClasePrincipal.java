package hilos_estados;

public class ClasePrincipal {
    public static void main (String args[]) {
        // Estado 1: se crea el hilo, pero no se ejecuta
        HiloProceso hilo_uno = new HiloProceso();
        HiloProceso hilo_dos = new HiloProceso();

        // Estado 2: hilo en estado ejecutable
        hilo_uno.start();
        try {
            // Estado 3: hilo bloqueado
            hilo_uno.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Error en el hilo uno " + e);
        }
        hilo_dos.start();
        //Estado 4: hilo finalizado
        hilo_dos.stop();
        try {
            hilo_dos.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo dos " + e);
        }
    }
}