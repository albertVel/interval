package mma.legacy.interval;

import org.junit.Test;

import static org.junit.Assert.*;

public class PuntoMedioTests {

    @Test
    public void PuntoMedioPostivo() {
        Interval interval = IntervalFactory.getInterval(0, 10, Opening.BOTH_OPENED);
        double puntoMedio = interval.PuntoMedio();
        assertEquals(5, puntoMedio, 0.0);
    }

    @Test
    public void PuntoMedioNegativo() {
        Interval interval = IntervalFactory.getInterval(-10, 0, Opening.BOTH_OPENED);
        double puntoMedio = interval.PuntoMedio();
        assertEquals(-5, puntoMedio, 0.0);
    }

    @Test
    public void PuntoMedio0() {
        Interval interval = IntervalFactory.getInterval(0, 0, Opening.BOTH_OPENED);
        double puntoMedio = interval.PuntoMedio();
        assertEquals(0, puntoMedio, 0.0);
    }
}
