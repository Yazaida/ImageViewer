
package ui.swing;

import java.awt.image.BufferedImage;
import model.Bitmap;

public class SwingBitmap implements Bitmap {

    BufferedImage bufferdImage;

    public SwingBitmap(BufferedImage bufferdImage) {
        this.bufferdImage = bufferdImage;
    }

    public BufferedImage getBufferdImage() {
        return bufferdImage;
    }

    @Override
    public double getWidth() {
        return bufferdImage.getWidth();
    }

    @Override
    public double getHeight() {
        return bufferdImage.getHeight();
    }
}

