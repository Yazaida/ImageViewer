
package persistence;

import java.awt.image.BufferedImage;
import model.RealImage;

public interface ImageLoader {
    public RealImage load();
}
//    public Image load(String filename) {
//        File file = new File(filename);
//        String[] filenames = file.getParentFile().list(getImageFilter());
//        Image[] images = linkImages(map(filenames));
//        return linkImages(map(filenames))[0];
//    }
//
//    public FilenameFilter getImageFilter() {
//        return new FilenameFilter() {
//            private String[] imageExtension = {"bmp", "png", "jpg"};
//
//            public boolean accept(File pathname, String name) {
//                for (String extension : imageExtension) {
//                    if (name.toLowerCase().endsWith(extension)) {
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
//    }
//
//    public Image[] map(String[] filenames) {
//        Image[] images = new Image[filenames.length];
//        for (int i = 0; i < images.length; i++) {
//            images[i] = new Image(filenames[i]);
//        }
//        return images;
//
//    }
//
//    public Image[] linkImages(Image[] images) {
//        linkNextImages(images);
//        linkPrevImages(images);
//        return images;
//    }
//
//    private void linkNextImages(Image[] images) {
//        for (int i = 0; i < images.length - 1; i++) {
//            images[i].setNext(images[i + 1]);
//        }
//        images[images.length - 1].setNext(images[0]);
//    }
//
//    private void linkPrevImages(Image[] images) {
//        for (int i = 1; i < images.length; i++) {
//            images[i].setPrev(images[i - 1]);
//        }
//        images[0].setPrev(images[images.length - 1]);
//    }
