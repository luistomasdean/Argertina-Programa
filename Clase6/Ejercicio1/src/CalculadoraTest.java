import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculadoraTest extends Calculadora {
    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(80, 3);
        assertEquals(240, resultado, 0.001);
    }

    @Test
    public void testSumaYDivision() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(calc.sumar(150, 180), 3);
        assertEquals(110, resultado, 0.001);
    }

    @Test
    public void testRestaYMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(calc.restar(90, 50), 15);
        assertNotEquals(605, resultado, 0.001);
    }

    @Test
    public void testSumaYMultiplicacion() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(calc.sumar(70, 40), 25);
        assertNotEquals(2700, resultado, 0.001);
    }
}
