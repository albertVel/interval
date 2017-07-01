package mma.legacy.interval;

import org.apache.log4j.Logger;

/**
 * Controla operaciones sobre intervalos que pueden ser abiertos o cerrados
 */
class Interval {


    final private static Logger logger = Logger.getLogger(Interval.class);

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
    double PuntoMedio() {
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
                return CasoBothOpened(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return CasoLeftOpened(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return CasoRightOpened(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return CasoUnopened(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean CasoUnopened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean CasoRightOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return MinimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return MinimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean CasoLeftOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return MinimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return MinimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            default:
                return false;
        }
    }

    private boolean MinimoYMaximoDentroIntervalo(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return MinimoIncluidoYMaximoDentroIntervalo(interval, MinimoDentroIntervalo(interval, minimumIncluded), maximumIncluded);
    }

    private boolean MaximoDentroIntervalo(Interval interval, boolean maximumIncluded) {
        return maximumIncluded || maximum == interval.maximum;
    }

    private boolean MinimoDentroIntervalo(Interval interval, boolean minimumIncluded) {
        return minimumIncluded || minimum == interval.minimum;
    }

    private boolean CasoBothOpened(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        switch (interval.opening) {
            case BOTH_OPENED:
                return MinimoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case LEFT_OPENED:
                return MinimoDentroIntervaloYMaximoIncluido(interval, minimumIncluded, maximumIncluded);
            case RIGHT_OPENED:
                return MinimoIncluidoYMaximoDentroIntervalo(interval, minimumIncluded, maximumIncluded);
            case UNOPENED:
                return (minimumIncluded) && (maximumIncluded);
            default:
                return false;
        }
    }

    private boolean MinimoIncluidoYMaximoDentroIntervalo(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return (minimumIncluded) && (MaximoDentroIntervalo(interval, maximumIncluded));
    }

    private boolean MinimoDentroIntervaloYMaximoIncluido(Interval interval, boolean minimumIncluded, boolean maximumIncluded) {
        return (minimumIncluded || minimum == interval.minimum) && (maximumIncluded);
    }

    /**
     * Este método calcula el ancho de un intervalo
     * @param interval El intervalo
     * @return Deveuelve un boolean conforme intersecta.
     */
    boolean intersectsWith(Interval interval) {
        if (minimum == interval.maximum) {
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
        if (maximum == interval.minimum) {
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
        return this.includes(interval.minimum)
                || this.includes(interval.maximum);
    }
}
