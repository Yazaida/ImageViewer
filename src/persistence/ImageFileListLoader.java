package persistence;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import model.Image;

public class ImageFileListLoader implements ImageListLoader {

    String path;
    private File file;

    public ImageFileListLoader(String filename) {
        this.path = filename;
    }

    public String getNameFile() {
        return path;
    }

    @Override
    public Image[] load() {
        file = new File(path);
        List<Image> listaImagenes=linkImages(loadImage());
        return listaImagenes.toArray(new Image[listaImagenes.size()]);
    }

    public List<Image> loadImage() {
        ArrayList<Image> imageList = new ArrayList<>();
        for (File fichero : file.listFiles(getImageFilter())) {
            if (fichero.isDirectory()) {
                continue;
            }
            Image image = new ProxyImage(new ImageLoaderFilename(file + "\\" + fichero.getName()));
            imageList.add(image);
        }
        return imageList;
    }

    private FilenameFilter getImageFilter() {
        return new FilenameFilter() {
            private String[] imageExtension = {"bmp", "tif", "jpg", "png"};

            @Override
            public boolean accept(File dir, String name) {
                for (String extension : imageExtension) {
                    if (name.toLowerCase().endsWith(extension)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public List<Image> linkImages(List<Image> images) {
        for (int i = 0; i < images.size(); i++) {
            Image image = images.get(i);
            image.setNext(images.get((i + 1) % images.size()));
            image.setPrev(images.get((i + images.size() - 1) % images.size()));
        }
        return images;
    }

}
