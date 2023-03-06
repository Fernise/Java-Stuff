package polimorfismo;

public class ClasePrincipal {
    public static void main(String args[]) {
        // Se instancia como parte de la clase padre pero con la funcion de la clase hija suma
        OperacionesClasePadre mensajero_suma = new SumaClaseHija();

        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();

        // Se instancia como parte de la clase padre pero con la funcion de la clase hija resta
        OperacionesClasePadre mensajero_resta = new RestaClaseHija();

        mensajero_resta.PedirDatos();
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
    }
}
