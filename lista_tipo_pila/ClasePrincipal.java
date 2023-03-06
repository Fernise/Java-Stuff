package lista_tipo_pila;


import javax.swing.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de opciones\n\n" +
                                "1. Insertar un nodo\n"
                                + "2. Eliminar un nodo\n"
                                + "3. ¿La pila está vacía?\n"
                                + "4. ¿Cuál es el último valor ingresado en la pila?\n"
                                + "5. ¿Cuántos nodos tiene la pila?\n"
                                + "6. Vaciar pila\n")
                                + "7. Mostrar contenido de la pila\n"
                                + "8. Salir\n");
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor, ingrese el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                            + pila.EliminarNodo());
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        break;
                    case 3:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila no está vacía.");
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es: "
                            + pila.MostrarUltimoValorIngresado());
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamanoPila() + " nodos.");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.PilaVacia();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentarlo");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while(opcion != 8);
    }
}