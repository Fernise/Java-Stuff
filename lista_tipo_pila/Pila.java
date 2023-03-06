package lista_tipo_pila;

import javax.swing.*;

public class Pila {
    private Nodo ultimo_valor_ingresado;
    int tamano = 0;
    String lista = "";

    public Pila() {
        ultimo_valor_ingresado = null;
        tamano = 0;
    }

    // Método: se comprueba si la pila se encuentra vacía
    public boolean PilaVacia() {
        return ultimo_valor_ingresado == null;
    }

    // Método: se inserta un nodo en la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimo_valor_ingresado;
        ultimo_valor_ingresado = nuevo_nodo;
        ++tamano;
    }

    // Método: se elimina un nodo de la pila
    public int EliminarNodo() {
        int auxiliar = ultimo_valor_ingresado.informacion;
        ultimo_valor_ingresado = ultimo_valor_ingresado.siguiente;
        --tamano;
        return auxiliar;
    }

    // Método: se muestra el ultimo valor ingresado en la pila
    public int MostrarUltimoValorIngresado() {
        return ultimo_valor_ingresado.informacion;
    }

    // Método: se comprueba el tamaño de la pila
    public int TamanoPila() {
        return tamano;
    }

    // Método: se vacia la pila
    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    // Método: se muestra el contenido de la pila
    public void MostrarValores() {
        Nodo recorrido = ultimo_valor_ingresado;
        while (recorrido != null) {
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}