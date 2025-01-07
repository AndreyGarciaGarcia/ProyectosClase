package FigurasGeometricasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FigurasGeometricas.FigurasGeometricas;

public class FigurasGeometricasTest {

    // Test para el área de un cuadrado
    @Test
    public void testCalcularAreaCuadrado() {
        double resultado = FigurasGeometricas.calcularAreaCuadrado(4);
        assertEquals(16.0, resultado, 0.001);
    }

    // Test para el perímetro de un cuadrado
    @Test
    public void testCalcularPerimetroCuadrado() {
        double resultado = FigurasGeometricas.calcularPerimetroCuadrado(4);
        assertEquals(16.0, resultado, 0.001);
    }

    // Test para el área de un rectángulo
    @Test
    public void testCalcularAreaRectangulo() {
        double resultado = FigurasGeometricas.calcularAreaRectangulo(5, 3);
        assertEquals(15.0, resultado, 0.001);
    }

    // Test para el perímetro de un rectángulo
    @Test
    public void testCalcularPerimetroRectangulo() {
        double resultado = FigurasGeometricas.calcularPerimetroRectangulo(5, 3);
        assertEquals(16.0, resultado, 0.001);
    }

    // Test para el área de un círculo
    @Test
    public void testCalcularAreaCirculo() {
        double resultado = FigurasGeometricas.calcularAreaCirculo(3);
        assertEquals(Math.PI * 3 * 3, resultado, 0.001);
    }

    // Test para el perímetro de un círculo (circunferencia)
    @Test
    public void testCalcularPerimetroCirculo() {
        double resultado = FigurasGeometricas.calcularPerimetroCirculo(3);
        assertEquals(2 * Math.PI * 3, resultado, 0.001);
    }
}
