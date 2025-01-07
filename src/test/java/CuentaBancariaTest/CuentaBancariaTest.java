package CuentaBancariaTest;

import org.junit.jupiter.api.Test;

import CuentaBancaria.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void testDepositar() {
        // Crear una cuenta con saldo inicial de 100
        CuentaBancaria cuenta = new CuentaBancaria(100);
        
        // Realizar un depósito de 50
        cuenta.depositar(50);
        
        // Verificar que el saldo sea 150
        assertEquals(150, cuenta.obtenerSaldo(), "El saldo debería ser 150 después del depósito");
    }

    @Test
    public void testRetirarConSaldoSuficiente() {
        // Crear una cuenta con saldo inicial de 200
        CuentaBancaria cuenta = new CuentaBancaria(200);
        
        // Realizar un retiro de 100
        boolean resultado = cuenta.retirar(100);
        
        // Verificar que el saldo es 100 después del retiro
        assertEquals(100, cuenta.obtenerSaldo(), "El saldo debería ser 100 después del retiro");
        // Verificar que el retiro fue exitoso
        assertTrue(resultado, "El retiro debería haber sido exitoso");
    }

    @Test
    public void testRetirarConSaldoInsuficiente() {
        // Crear una cuenta con saldo inicial de 50
        CuentaBancaria cuenta = new CuentaBancaria(50);
        
        // Intentar retirar más de lo que hay en la cuenta
        boolean resultado = cuenta.retirar(100);
        
        // Verificar que el saldo sigue siendo 50
        assertEquals(50, cuenta.obtenerSaldo(), "El saldo debería seguir siendo 50");
        // Verificar que el retiro no fue posible
        assertFalse(resultado, "El retiro debería fallar debido a saldo insuficiente");
    }

    @Test
    public void testDepositarConCantidadNegativa() {
        // Crear una cuenta con saldo inicial de 200
        CuentaBancaria cuenta = new CuentaBancaria(200);
        
        // Intentar depositar una cantidad negativa
        cuenta.depositar(-50);
        
        // Verificar que el saldo no cambió
        assertEquals(200, cuenta.obtenerSaldo(), "El saldo no debería haber cambiado con un depósito negativo");
    }
}

