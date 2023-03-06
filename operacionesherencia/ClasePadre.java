package operacionesherencia;
import java.util.Scanner;

public class ClasePadre {
    protected int valor_uno = 0, valor_dos = 0, resultado = 0;
    Scanner entrada = new Scanner(System.in);

    // Método público: se piden valores al usuario
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor_uno = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor_dos = entrada.nextInt();
    }

    // Método público: se muestra el resultado
    public void MostrarResultado() {
        System.out.println(resultado);
    }
}
