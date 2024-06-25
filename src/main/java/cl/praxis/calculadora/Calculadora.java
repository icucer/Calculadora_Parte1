package cl.praxis.calculadora;

public class Calculadora {
    public int suma(int numero1, int numero2) {
        return (numero1 + numero2);
    }

    public int resta(int numero1, int numero2) {
        return (numero1 - numero2);
    }

    public int multiplicacion(int numero1, int numero2) {
        return (numero1 * numero2);
    }

    public int division(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (numero1 / numero2);
    }
}
