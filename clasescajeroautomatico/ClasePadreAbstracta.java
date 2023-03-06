package clasescajeroautomatico;
import java.util.Scanner;

public abstract class ClasePadreAbstracta {
    protected int transacciones = 0, retiro = 0, deposito = 0;
    private static int saldo = 0;
    Scanner entrada = new Scanner(System.in);

    // Método público: menú principal
    public void Operaciones() {
        int bandera = 0;
        int opcion_seleccionada = 0;
        do {
            do {
                System.out.println("Por favor, seleccione una opción: ");
                System.out.println("    1. Consultar saldo.");
                System.out.println("    2. Retirar efectivo.");
                System.out.println("    3. Depositar efectivo.");
                System.out.println("    4. Salir.");
                opcion_seleccionada = entrada.nextInt();
                if (opcion_seleccionada >= 1 && opcion_seleccionada <= 4) {
                    bandera = 1;
                }
                else {
                    System.out.println("-----------------------------------------");
                    System.out.println("Opción no disponible. Vuelva a intentarlo");
                    System.out.println("-----------------------------------------");
                }
            } while(bandera == 0);
            if (opcion_seleccionada == 1) {
                ClasePadreAbstracta mensajero = new ClaseHijaConsulta();
                mensajero.Transacciones();
            }
            else if (opcion_seleccionada == 2) {
                ClasePadreAbstracta mensajero = new ClaseHijaRetiro();
                mensajero.Transacciones();
            }
            else if (opcion_seleccionada == 3) {
                ClasePadreAbstracta mensajero = new ClaseHijaDeposito();
                mensajero.Transacciones();
            }
            else if (opcion_seleccionada == 4) {
                System.out.println("-------------------------");
                System.out.println("¡Gracias!, vuelva pronto.");
                System.out.println("-------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    // Método público: se solicita la cantidad a retirar
    public void Retiro() {
        retiro = entrada.nextInt();
    }
    // Método público: se solicita la cantidad a depositar
    public void Deposito() {
        deposito = entrada.nextInt();
    }
    // Método abstracto
    public abstract void Transacciones();
    //Método getter
    public int getSaldo() {
        return saldo;
    }
    //Método setter
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}