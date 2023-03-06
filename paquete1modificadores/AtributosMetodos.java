package paquete1modificadores;

public class AtributosMetodos {
    // Modificador de acceso por defecto
    int valor_uno = 0, valor_dos = 0;
    String valor_tres;

    // Modificador de acceso público
    public int valor_cuatro = 0, valor_cinco = 0;
    public String valor_seis;
    public void MetodoPublico() {
        System.out.println("Hola Mundo");
    }

    // Modificador de acceso privado
    private int valor_siete = 0, valor_ocho = 0;
    private String valor_nueve;

    private void MetodoPrivado() {
        System.out.println("Hola Mundo");
    }

    // Método: Getter
    public int getValorUno() {
        return valor_uno;
    }

    // Método: Setter
    public void setValorUno(int valor_uno) {
        this.valor_uno = valor_uno;
    }

    // Modificador de acceso protected
    protected int valores_uno = 0, valores_dos = 0;
    protected String valores_tres;

    protected void MetodoProtected() {
        System.out.println("Hola Mundo");
    }
}