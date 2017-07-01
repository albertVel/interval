package mma.legacy.interval;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IncludesTests {

    @BeforeClass
    public static void setUpClass() {
        BasicConfigurator.configure();
    }
    @Test
    public void Incluido_Dentro_Both_Opened_Por_Abajo() {
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includes(1));
    }

    @Test
    public void Incluido_Dentro_Both_Opened_Por_Arriba() {
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includes(9));
    }

    @Test
    public void Excluido_Dentro_Both_Opened_Por_Abajo() {
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includes(0));
    }

    @Test
    public void Excluido_Dentro_Both_Opened_Por_Arriba() {
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED).includes(10));
    }
    //-----

    @Test
    public void Incluido_Dentro_Left_Opened_Por_Abajo() {
        // (..]
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includes(1));
    }

    @Test
    public void Incluido_Dentro_Left_Opened_Por_Arriba() {
        // (..]
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includes(10));
    }

    @Test
    public void Excluido_Dentro_Left_Opened_Por_Abajo() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includes(0));
    }

    @Test
    public void Excluido_Dentro_Left_Opened_Por_Arriba() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.LEFT_OPENED).includes(11));
    }

    //----

    @Test
    public void Incluido_Dentro_Right_Opened_Por_Abajo() {
        // left is unopened
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includes(0));
    }

    @Test
    public void Incluido_Dentro_Right_Opened_Por_Arriba() {
        // (..]
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includes(9));
    }

    @Test
    public void Excluido_Dentro_Right_Opened_Por_Abajo() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includes(-1));
    }

    @Test
    public void Excluido_Dentro_Right_Opened_Por_Arriba() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.RIGHT_OPENED).includes(10));
    }

    //----

    @Test
    public void Incluido_Dentro_Unopened_Por_Abajo() {
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includes(0));
    }

    @Test
    public void Incluido_Dentro_Unopened_Por_Arriba() {
        // (..]
        assertTrue(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includes(10));
    }

    @Test
    public void Excluido_Dentro_Unopened_Por_Abajo() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includes(-1));
    }

    @Test
    public void Excluido_Dentro_Unopened_Por_Arriba() {
        // (..]
        assertFalse(IntervalFactory.getInterval(0, 10, Opening.UNOPENED).includes(11));
    }
}
