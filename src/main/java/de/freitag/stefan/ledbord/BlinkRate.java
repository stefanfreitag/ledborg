package de.freitag.stefan.ledbord;

/**
 * Allowed blink rates in milliseconds.
 *
 * @author Stefan Freitag
 */
public enum BlinkRate {
    /**
     * 1 second.
     */
    ONE_SECOND(1000l),
    /**
     * Two seconds.
     */
    TWO_SECONDS(2000l),
    /**
     * Five seconds.
     */
    FIVE_SECONDS(5000l);

    /**
     * Blink rate in milliseconds.
     */
    private long blinkRate;


    BlinkRate(long blinkRate) {
        this.blinkRate = blinkRate;
    }


}
