package clases_constructor;
import java.util.Scanner;

public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    // Método: se utiliza como constructor, sin serlo
    public void PedirNombre() {
        System.out.print("¿Cuál es su nombre?: ");
        nombre = entrada.nextLine();
    }

    public void Imprimir() {
        System.out.println("Su nombre es: " + nombre);
    }
}
