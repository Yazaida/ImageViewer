/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import ui.swing.SwingBitmap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import model.RealImage;


public class ImageLoaderFilename implements ImageLoader{
     private String fileName;

    public ImageLoaderFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public RealImage load() {
        return new RealImage(new SwingBitmap(loadImage()));
    }

    private BufferedImage loadImage() {
        try {
            return ImageIO.read(new File(fileName));
        } catch (IOException ex) {
            return null;
        }
    }

    
}
