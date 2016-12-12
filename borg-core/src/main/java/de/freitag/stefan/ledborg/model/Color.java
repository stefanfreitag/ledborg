package de.freitag.stefan.ledborg.model;

import java.util.Objects;

/**
 * A color defined by float values [0;1] for red, green and blue.
 */
public class Color {

    private float red;
    private float green;
    private float blue;

    public Color(){
        this(0.0f,0.0f,0.0f);
    }

    public Color(final float red, final float green, final float blue) {

        if (!inRange(red)) {
            throw new IllegalArgumentException("Invalid value " + red + " for red. Allowed range is [0;1].");
        }

        if (!inRange(green)) {
            throw new IllegalArgumentException("Invalid value " + green + " for green. Allowed range is [0;1].");
        }
        if (!inRange(blue)) {
            throw new IllegalArgumentException("Invalid value " + blue + " for blue. Allowed range is [0;1].");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color brighter(){
        final java.awt.Color color = new java.awt.Color(this.red, this.getGreen(), this.blue);
        float[] floats = color.brighter().getColorComponents(null);
        return new Color(floats[0],floats[1],floats[2]);
    }

    public Color darker(){
        final java.awt.Color color = new java.awt.Color(this.red, this.getGreen(), this.blue);
        float[] floats = color.darker().getColorComponents(null);
        return new Color(floats[0],floats[1],floats[2]);
    }

    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getBlue() {
        return blue;
    }

    private boolean inRange(final float value){
        return 0.0f<=value && value<=1.0f;
    }

    @Override
    public String toString() {
        return "Color{" +
                "blue=" + blue +
                ", green=" + green +
                ", red=" + red +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Float.compare(color.getRed(), getRed()) == 0 &&
                Float.compare(color.getGreen(), getGreen()) == 0 &&
                Float.compare(color.getBlue(), getBlue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRed(), getGreen(), getBlue());
    }
}
