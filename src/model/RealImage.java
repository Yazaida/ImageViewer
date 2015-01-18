package model;

public class RealImage extends Image {

    Bitmap bitmap;

    public RealImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public Bitmap getBitMap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

}
