package limitar_decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasePrincipal {
    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);

        // Se utiliza la clase DecimalFormat
        DecimalFormat decimal_format = new DecimalFormat("#.00");
        System.out.println("La raíz cuadrada de " + numero + " es: " + decimal_format.format(raiz));

        // Se utiliza String format
        System.out.println("La raíz cuadrada de " + numero + " es: " + String.format("%.2f", raiz));

        // Se utiliza la clase Math.round
        System.out.println("La raíz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 100d) / 100);

        // Se utiliza la clase BigDecimal
        BigDecimal big_decimal = new BigDecimal(raiz);
        big_decimal = big_decimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de " + numero + " es: " + big_decimal.doubleValue());

    }
}