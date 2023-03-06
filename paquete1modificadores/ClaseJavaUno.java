package paquete1modificadores;

public class ClaseJavaUno {
    public static void main(String args[]) {
        AtributosMetodos mensajero = new AtributosMetodos();

        // Modificador de acceso por defecto
        mensajero.valor_uno = 1;
        mensajero.valor_dos = 2;

        // Modificador de acceso público
        mensajero.valor_cuatro = 3;
        mensajero.MetodoPublico();

        // Modificador de acceso privado (Setter/Getter)
        mensajero.setValorUno(8);
        System.out.println(mensajero.getValorUno());

        // Modificador de acceso protected
        mensajero.valores_uno = 1;
        mensajero.valores_dos = 2;
        mensajero.MetodoProtected();
    }
}
