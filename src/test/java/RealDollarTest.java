
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealDollarTest {

    @Test
    void deveRetornar6Reais() {
        RealDollar realDollar = new RealDollar();
        realDollar.setReal(1.0);
        realDollar.setTaxa(0.4);

        assertEquals(6, Math.ceil(realDollar.calcularNota()));
    }

    @Test
    void deveRetornar42EmReais() {
        RealDollar realDollar = new RealDollar();
        realDollar.setReal(7.0);
        realDollar.setTaxa(2.8);

        assertEquals(42, Math.ceil(realDollar.calcularNota()));
    }

}