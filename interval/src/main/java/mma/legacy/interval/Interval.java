package mma.legacy.interval;

import org.apache.log4j.Logger;

/**
 * Controla operaciones sobre intervalos que pueden ser abiertos o cerrados
 */
class Interval {

    private final static Logger logger = Logger.getLogger(Interval.class);

    private final int minimum;  // número entero que indica el limite superior del intervalo
    private final int maximum;  // número entero que indica el limite superior del intervalo
    private final Opening opening; // Valor booleano que indica si el intervalo es abierto o cerrado

    /**
     * Constructor de la clase
     *
     * @param minimum El intervalo minimo
     * @param maximum El intervalo maximo
     * @param opening Tipo de opening
     */
    Interval(int minimum, int maximum, Opening opening) {
        this.minimum = minimum;
        this.maximum = maximum;
        this.opening = opening;
        logger.debug("objeto creado");
    }

    /**
     * Este método calcula el punto medio entre maximum minimum.
     *
     * @return Devuelve el punto medio entre maximum y minimum.
     */
    double puntoMedio() {
        return (double) (maximum + minimum) / 2;
    }

    /*
     * Este método mira si un número está dentro de un determiando intervalo
     */
    boolean includes(double value) {
        logger.debug("Entro en el método");
        switch (opening) {
            case BOTH_OPENED:
                return minimum < value && value < maximum;
            case LEFT_OPENED:
                return minimum < value && value <= maximum;
            case RIGHT_OPENED:
                return minimum <= value && value < maximum;
            case UNOPENED:
                return minimum <= value && value <= maximum;
            default:
                return false;
        }
    }

    /**
     * Este método calcula si un número está dentro de un intervalo
     * @param interval El intervalo
     * @return Devuelve un boolean conforme el intervalo esta incluido dentro maximum y minimum.
     */
    boolean includes(Interval interval) {
        boolean minimumIncluded = this.includes(interval.minimum);
        boolean maximumIncluded = this.includes(interval.maximum);
        switch (opening) {
            case BOTH_OPENED:
                return casoBothOpened(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return casoLeftOpened(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return casoRightOpened(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return casoUnopened(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean casoUnopened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean casoRightOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return minimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return minimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean casoLeftOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return minimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return minimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean minimoYMaximoDentroIntervalo(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return minimoIncluidoYMaximoDentroIntervalo(interval, minimoDentroIntervalo(interval, minimumIncluded), maximumIncluded);
    }

    private boolean maximoDentroIntervalo(Interval interval, boolean maximumIncluded) {
        return maximumIncluded || maximum == interval.maximum;
    }

    private boolean minimoDentroIntervalo(Interval interval, boolean minimumIncluded) {
        return minimumIncluded || minimum == interval.minimum;
    }

    private boolean casoBothOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return minimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return minimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return minimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return (minimumIncluded) && (maximumIncluded);
            default:
                return false;
        }
    }

    private boolean minimoIncluidoYMaximoDentroIntervalo(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return (minimumIncluded) && (maximoDentroIntervalo(interval, maximumIncluded));
    }

    private boolean minimoDentroIntervaloYMaximoIncluido(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return (minimumIncluded || minimum == interval.minimum) && (maximumIncluded);
    }

    /**
     * Este método calcula el ancho de un intervalo
     * @param interval El intervalo
     * @return Deveuelve un boolean conforme intersecta.
     */
    boolean intersectsWith(Interval interval) {
        if (minimum == interval.maximum) {
            return CasoMinimoIgualMaximo(interval);
        }
        if (maximum == interval.minimum) {
            return CasoMaximoIgualMinimo(interval);
        }
        return this.includes(interval.minimum)
                || this.includes(interval.maximum);
    }

    private boolean CasoMaximoIgualMinimo(Interval interval) {
        switch (opening) {
            case BOTH_OPENED:
            case RIGHT_OPENED:
                return false;
            case LEFT_OPENED:
            case UNOPENED:
                return interval.opening == Opening.RIGHT_OPENED ||
                        interval.opening == Opening.UNOPENED;
            default:
                return false;
        }
    }

    private boolean CasoMinimoIgualMaximo(Interval interval) {
        switch (opening) {
            case BOTH_OPENED:
            case LEFT_OPENED:
                return false;
            case RIGHT_OPENED:
            case UNOPENED:
                return interval.opening == Opening.LEFT_OPENED ||
                        interval.opening == Opening.UNOPENED;
            default:
                return false;
        }
    }
}
