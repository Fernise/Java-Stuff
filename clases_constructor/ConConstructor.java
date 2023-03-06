package clases_constructor;
import java.util.Scanner;
public class ConConstructor {
    // Método: constructor
    public ConConstructor() {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.print("¿Cuál es su nombre?: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
