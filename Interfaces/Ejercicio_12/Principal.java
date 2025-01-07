package Ejercicio_12;

public class Principal {

	public static void main(String[] args) {
		EmpleadoFijo empleadoFijo = new EmpleadoFijo("Juan Pérez", 3000);

        
        EmpleadoporHoras empleadoPorHoras = new EmpleadoporHoras("Ana Gómez", 20, 160);

      
        System.out.println("Empleado Fijo: " + empleadoFijo.obtenerNombre() + " - Salario: $" + empleadoFijo.calcularSalario());
        System.out.println("Empleado por Horas: " + empleadoPorHoras.obtenerNombre() + " - Salario: $" + empleadoPorHoras.calcularSalario());

	}

}
