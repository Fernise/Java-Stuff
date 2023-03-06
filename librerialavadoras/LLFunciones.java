/*
* Clase para las funciones lógicas de una lavadora (Encapsulamiento)
*/

package librerialavadoras;

public class LLFunciones {
    private int kilos = 0, llenado_completo = 0, tipo_ropa = 0, lavado_completo = 0, secado_completo = 0;

    // Constructor
    public LLFunciones(int kilos, int tipo_ropa) {
        this.kilos = kilos;
        this.tipo_ropa = tipo_ropa;
    }

    // Método privado: comprueba si la lavadora se llena
    private void Llenado() {
        if (kilos <= 12) {
            llenado_completo = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        }
        else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    // Método privado: comprueba si se lava ropa de un tipo u otro
    private void Lavado() {
        Llenado();
        if (llenado_completo == 1) {
            if (tipo_ropa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                lavado_completo = 1;
            }
            else if (tipo_ropa == 2) {
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavado_completo = 1;
            }
            else {
                System.out.println("El tipo de ropa no está disponible");
                System.out.println("Se lavara como ropa de color / Lavada intenso");
                lavado_completo = 1;
            }
        }
    }

    // Método privado: comprueba si la ropa se secó
    private void Secado() {
        Lavado();
        if (lavado_completo == 1) {
            System.out.println("Secando...");
            secado_completo = 1;
        }
    }

    // Método público: comprueba si la ropa está lista
    public void CicloFinalizado() {
        Secado();
        if (secado_completo == 1) {
            System.out.println("Tu ropa está lista");
        }
    }

    // Método: Getter
    public int getTipoRopa() {
        return tipo_ropa;
    }

    // Método: Setter
    public void setTipoRopa(int tipo_ropa) {
        this.tipo_ropa = tipo_ropa;
    }
}
