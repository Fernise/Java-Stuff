package mainherencia;
import operacionesherencia.ClaseHijaSuma;
import operacionesherencia.ClaseHijaResta;

public class ClasePrincipal {
    public static void main(String args[]) {
       ClaseHijaSuma mensajero_suma = new ClaseHijaSuma();
       ClaseHijaResta mensajero_resta = new ClaseHijaResta();

       // Se utilizan los métodos de la clase padre y la clase hija Suma
       mensajero_suma.PedirDatos();
       mensajero_suma.Sumar();
       System.out.print("El resultado de la suma es: ");
       mensajero_suma.MostrarResultado();

        // Se utilizan los métodos de la clase padre y la clase hija Resta
        mensajero_resta.PedirDatos();
        mensajero_resta.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajero_resta.MostrarResultado();

    }
}