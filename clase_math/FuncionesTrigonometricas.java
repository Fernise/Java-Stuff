package clase_math;

public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        double resultado = 0;
        double angulo_grados = 45;
        double angulo_radianes = Math.toRadians(angulo_grados);

        // Seno
        resultado = Math.sin(angulo_radianes);
        System.out.println("Seno de: " + angulo_grados + "º = " + resultado);

        // Coseno
        resultado = Math.cos(angulo_radianes);
        System.out.println("Coseno de: " + angulo_grados + "º = " + resultado);

        // Tangente
        resultado = Math.tan(angulo_radianes);
        System.out.println("Tangente de: " + angulo_grados + "º = " + resultado);

        // Arcoseno
        double valor_ingresado = 0.707;
        angulo_radianes = Math.asin(valor_ingresado);
        angulo_grados = Math.toDegrees(angulo_radianes);
        System.out.println("Arcoseno de: " + valor_ingresado + " = " + angulo_grados + "º");

        // Arcocoseno
        angulo_radianes = Math.acos(valor_ingresado);
        angulo_grados = Math.toDegrees(angulo_radianes);
        System.out.println("Arcocoseno de: " + valor_ingresado + " = " + angulo_grados + "º");

        // Arcotangente
        angulo_radianes = Math.atan(valor_ingresado);
        angulo_grados = Math.toDegrees(angulo_radianes);
        System.out.println("Arcotangente de: " + valor_ingresado + " = " + angulo_grados + "º");
    }
}
