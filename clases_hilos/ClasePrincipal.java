package clases_hilos;
public class ClasePrincipal {
    public static void main(String args[]) {
        ProcesoUno hilo_uno = new ProcesoUno();
        ProcesoUno hilo_tres = new ProcesoUno();
        Thread hilo_dos = new Thread(new ProcesoDos());
        hilo_uno.start();
        hilo_tres.start();
        hilo_dos.start();
    }
}