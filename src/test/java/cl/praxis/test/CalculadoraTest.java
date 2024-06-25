package cl.praxis.test;

import cl.praxis.calculadora.Calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Prueba TDD Clase Calculadora")
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSuma() {
        assertEquals(5, calculadora.suma(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, calculadora.resta(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.division(6, 3));
    }

    @Test
    @DisplayName("Division by zero should throw IllegalArgumentException")
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.division(1, 0), "Cannot divide by zero.");
    }
}
