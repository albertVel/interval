package mma.legacy.interval;


/**
 * Esta clase abstracta se ha creado por comodidad. 
 * Crea automáticamente intervalos
 * @author Agustin
 *
 */
class IntervalFactory {

    private IntervalFactory() {
    }

	static Interval getInterval(int minimum, int maximum, Opening opening) {
		return new Interval(minimum, maximum, opening);
	}
}
