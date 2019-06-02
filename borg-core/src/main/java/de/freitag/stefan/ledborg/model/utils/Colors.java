package de.freitag.stefan.ledborg.model.utils;

import de.freitag.stefan.ledborg.model.Color;
import java.util.function.Function;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Colors {

  public boolean inRange(final float value) {
    return 0.0f <= value && value <= 1.0f;
  }

  public Function<Color, Color> darker =
      (Color c) -> {
        final java.awt.Color color = new java.awt.Color(c.getRed(), c.getGreen(), c.getBlue());
        float[] floats = color.darker().getColorComponents(null);
        return new Color(floats[0], floats[1], floats[2]);
      };

  public Function<Color, Color> brighter =
      (Color c) -> {
        final java.awt.Color color = new java.awt.Color(c.getRed(), c.getGreen(), c.getBlue());
        float[] floats = color.brighter().getColorComponents(null);
        return new Color(floats[0], floats[1], floats[2]);
      };
}
