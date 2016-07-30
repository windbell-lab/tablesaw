package com.github.lwhite1.tablesaw.plotting.glimpse;

import com.metsci.glimpse.support.color.GlimpseColor;
import com.metsci.glimpse.support.settings.SwingLookAndFeel;

import java.awt.*;
import java.text.ParseException;

/**
 *
 */
class TablesawLookAndFeel extends SwingLookAndFeel {

  TablesawLookAndFeel() {
    super();

    float[] background = GlimpseColor.fromColorAwt(Color.WHITE);

    this.map.put(CROSSHAIR_COLOR, GlimpseColor.getGray());
    this.map.put(BORDER_COLOR, GlimpseColor.getGray());

    try {
      this.map.put(PLOT_BACKGROUND_COLOR, GlimpseColor.fromColorHex("#FAFAFA"));
    } catch (ParseException e) {
      e.printStackTrace();
    }

    this.map.put(FRAME_BACKGROUND_COLOR, background);

    this.map.put(TITLE_FONT, new Font(Font.SANS_SERIF, Font.PLAIN, 14));
    this.map.put(AXIS_FONT, new Font(Font.SANS_SERIF, Font.PLAIN, 12));


  }
}
