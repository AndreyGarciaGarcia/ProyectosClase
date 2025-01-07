package FigurasGeometricas;

public class FigurasGeometricas {

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}