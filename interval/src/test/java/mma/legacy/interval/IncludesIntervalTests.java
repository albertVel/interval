package mma.legacy.interval;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IncludesIntervalTests {



    @Test
    public void EstudioDelIntervaloAbiertoConIntervaloAbierto() {

        Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.BOTH_OPENED);

        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoConIntervaloAbiertoIzquierda() {

        Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.BOTH_OPENED);

        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoConIntervaloAbiertoDerecha() {

        Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.BOTH_OPENED);

        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoConIntervaloCerrrado() {

        Interval bothOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.BOTH_OPENED);

        assertTrue(bothOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
    }


    @Test
    public void EstudioDelIntervaloAbiertoIzquierdaConIntervaloAbierto() {
        Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.LEFT_OPENED);

        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoIzquierdaConIntervaloAbiertoIzquierda() {
        Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.LEFT_OPENED);

        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoIzquierdaConIntervaloAbiertoDerecha() {
        Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.LEFT_OPENED);

        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));

    }

    @Test
    public void EstudioDelIntervaloAbiertoIzquierdaConIntervaloCerrado() {
        Interval leftOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.LEFT_OPENED);

        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
    }


    @Test
    public void EstudioDelIntervaloAbiertoDerechaConIntervaloAbierto() {
        Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.RIGHT_OPENED);

        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoDerechaConIntervaloAbiertoIzquierda() {
        Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.RIGHT_OPENED);

        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));
    }

    @Test
    public void EstudioDelIntervaloAbiertoDerechaConIntervaloAbiertoDerecha() {
        Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.RIGHT_OPENED);

        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));
    }


    @Test
    public void EstudioDelIntervaloAbiertoDerechaConIntervaloCerrado() {
        Interval rightOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.RIGHT_OPENED);

        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));
    }

    @Test
    public void EstudioDelIntervaloCerradoConIntervaloCerrado() {

        Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.UNOPENED);

        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.UNOPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.UNOPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.UNOPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.UNOPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.UNOPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.UNOPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.UNOPENED)));

    }

    @Test
    public void EstudioDelIntervaloCerradoConIntervaloAbierto() {

        Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.UNOPENED);

        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.BOTH_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.BOTH_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.BOTH_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.BOTH_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.BOTH_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.BOTH_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.BOTH_OPENED)));

    }
    @Test
    public void EstudioDelIntervaloCerradoConIntervaloAbiertoIzquierda() {

        Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.UNOPENED);

        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.LEFT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.LEFT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.LEFT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.LEFT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.LEFT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.LEFT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.LEFT_OPENED)));

    }

    @Test
    public void EstudioDelIntervaloCerradoConIntervaloAbiertoDerecha() {

        Interval unopenedOpenedPivot = IntervalFactory.getInterval(20, 35, Opening.UNOPENED);

        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(10, 15, Opening.RIGHT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(15, 20, Opening.RIGHT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(20, 25, Opening.RIGHT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(25, 30, Opening.RIGHT_OPENED)));
        assertTrue(unopenedOpenedPivot.includes(IntervalFactory.getInterval(30, 35, Opening.RIGHT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(35, 40, Opening.RIGHT_OPENED)));
        assertFalse(unopenedOpenedPivot.includes(IntervalFactory.getInterval(40, 45, Opening.RIGHT_OPENED)));

    }
}
