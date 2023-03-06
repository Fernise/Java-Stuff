package division_try_catch;
import java.util.Scanner;

public class ClaseDivision {
    public static void main(String args[]) {
        try {
            int valor_uno = 0, valor_dos = 0, resultado = 0;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduzca el primer valor: ");
            valor_uno = entrada.nextInt();
            System.out.print("Introduzca el segundo valor: ");
            valor_dos = entrada.nextInt();
            resultado = valor_uno / valor_dos;
            System.out.println("División es igual a: " + resultado);
        } catch (Exception e) {
            System.out.println("Error! " + e);
        } finally {
            System.out.println("Operación concluida!");
        }
    }
}