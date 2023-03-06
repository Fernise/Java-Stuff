package numeros_aleatorios;
import java.util.Random;

public class ClaseDos {
    public static void main(String[] args) {
        int aleatorio = 0;
        Random random = new Random();

        aleatorio = (int) (random.nextDouble() * 100);
        System.out.println(aleatorio);
    }
}