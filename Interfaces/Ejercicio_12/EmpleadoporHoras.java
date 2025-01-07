package Ejercicio_12;

public class EmpleadoporHoras implements Empleado {
    private String nombre;
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoporHoras(String nom, double tarPorHor, int horTraba) {
        this.nombre = nom;
        this.tarifaPorHora = tarPorHor;
        this.horasTrabajadas = horTraba;
    }


    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

 
    @Override
    public double calcularSalario() {
        return this.tarifaPorHora * this.horasTrabajadas;
    }
}