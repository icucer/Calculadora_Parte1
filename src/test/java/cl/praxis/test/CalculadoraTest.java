package cl.praxis.test;

import cl.praxis.calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        Assert.assertEquals(5, calculadora.suma(2, 3));
    }

    @Test
    public void testResta() {
        Assert.assertEquals(1, calculadora.resta(3, 2));
    }

    @Test
    public void testMultiplicar() {
        Assert.assertEquals(6, calculadora.multiplicacion(2, 3));
    }

    @Test
    public void testDividir() {
        Assert.assertEquals(2, calculadora.division(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        calculadora.division(1, 0);
    }
}
