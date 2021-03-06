package mma.legacy.interval;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntersectsTests {

    @Test
    public void IntervalOpenendhasIntersectionTest() {

        Interval bothOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.BOTH_OPENED);

        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
        assertTrue(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
        assertFalse(bothOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));


    }

    @Test
    public void IntervalIzquierdaOpeneedhasIntersectionTest() {

        Interval leftOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.LEFT_OPENED);

        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
        assertTrue(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
        assertFalse(leftOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));

    }

    @Test
    public void IntervalDerechaOpenendhasIntersectionTest() {


        Interval rightOpenedPivot = IntervalFactory.getInterval(20, 40, Opening.RIGHT_OPENED);
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
        assertTrue(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
        assertFalse(rightOpenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));

    }

    @Test
    public void IntervalCerradohasIntersectionTest(){
        Interval unopenedPivot = IntervalFactory.getInterval(20, 40, Opening.UNOPENED);
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.BOTH_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.BOTH_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.BOTH_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.BOTH_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.BOTH_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.BOTH_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.BOTH_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.BOTH_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.BOTH_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.LEFT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.LEFT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.LEFT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.LEFT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.RIGHT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.RIGHT_OPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.RIGHT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.RIGHT_OPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(5, 15, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(10, 20, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(15, 25, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(20, 30, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(25, 35, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(30, 40, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(35, 45, Opening.UNOPENED)));
        assertTrue(unopenedPivot.intersectsWith(IntervalFactory.getInterval(40, 50, Opening.UNOPENED)));
        assertFalse(unopenedPivot.intersectsWith(IntervalFactory.getInterval(45, 55, Opening.UNOPENED)));
    }
}
