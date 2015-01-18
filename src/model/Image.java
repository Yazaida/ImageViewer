package model;

public abstract class Image {

    private String name;
    private Image next;
    private Image prev;

    public String getName() {
        return name;
    }

    public Image getNext() {
        return next;
    }

    public Image getPrev() {
        return prev;
    }

    public void setNext(Image next) {
        this.next = next;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

    public abstract Bitmap getBitMap();

}
