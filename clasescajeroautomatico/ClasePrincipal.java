package clasescajeroautomatico;

public class ClasePrincipal {
    public static void main(String args[]) {
        ClasePadreAbstracta mensajero = new ClaseHijaConsulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }
}
