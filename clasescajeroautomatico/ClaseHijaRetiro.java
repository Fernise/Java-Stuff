package clasescajeroautomatico;

public class ClaseHijaRetiro extends ClasePadreAbstracta {
    @Override
    public void Transacciones() {
        System.out.println("¿Cuánto desea retirar?: ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("---------------------------------");
            System.out.println("Retiró: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("---------------------------------");
        }
        else {
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }
    }
}
