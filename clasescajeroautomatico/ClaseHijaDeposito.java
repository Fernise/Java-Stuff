package clasescajeroautomatico;

public class ClaseHijaDeposito extends ClasePadreAbstracta {
    @Override
    public void Transacciones() {
        System.out.println("¿Cuánto desea depositar?: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println("Depositó: " + deposito);
        System.out.println("Su saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
