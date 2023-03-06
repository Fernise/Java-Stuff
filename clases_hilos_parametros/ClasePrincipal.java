package clases_hilos_parametros;

public class ClasePrincipal {
    public static void main(String args[]) {
        Proceso hilo_uno = new Proceso(" Hilo 1");
        Proceso hilo_dos = new Proceso(" Hilo 2");
        Proceso hilo_tres = new Proceso(" Hilo 3");

        hilo_uno.ValorCondicion(5);
        hilo_dos.ValorCondicion(10);
        hilo_tres.ValorCondicion(5);

        hilo_uno.start();
        hilo_dos.start();
        hilo_tres.start();
    }
}
