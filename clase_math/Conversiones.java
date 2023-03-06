package clase_math;

public class Conversiones {
    public static void main(String[] args) {
        double angulo_grados = 45;
        double angulo_radianes = Math.toRadians(angulo_grados);
        System.out.println("Deg a Rad: " + angulo_grados + "º = " + angulo_radianes + " rad");

        angulo_grados = Math.toDegrees(angulo_radianes);
        System.out.println("Rad a Deg: " + angulo_radianes + " rad = " + angulo_grados + "º");
    }
}
