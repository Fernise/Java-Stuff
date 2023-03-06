package paquete2modificadores;
import paquete1modificadores.AtributosMetodos;

public class ClaseJavaDos {
    public static void main(String args[]) {
        AtributosMetodos mensajero = new AtributosMetodos();

        // Modificador de acceso público
        mensajero.MetodoPublico();
        mensajero.valor_cuatro = 4;

        // Modificador de acceso privado (Setter/Getter)
        mensajero.setValorUno(10);
        System.out.println(mensajero.getValorUno());
    }
}
