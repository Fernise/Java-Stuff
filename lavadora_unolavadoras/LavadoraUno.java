package lavadora_unolavadoras;
import librerialavadoras.LLFunciones;
import java.util.Scanner;

public class LavadoraUno {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        int tipo_ropa = entrada.nextInt();

        System.out.println("¿Cuántos kilos de ropa?");
        int kilos = entrada.nextInt();

        LLFunciones mensajero = new LLFunciones(kilos, tipo_ropa);
        mensajero.setTipoRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoRopa());
        mensajero.CicloFinalizado();
    }
}