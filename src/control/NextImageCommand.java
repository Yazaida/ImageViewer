package control;

import ui.ImageDisplay;

public class NextImageCommand implements Command {

    ImageDisplay imageViewer;

    public NextImageCommand(ImageDisplay imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void execute() {
        imageViewer.setImage(imageViewer.getImage().getNext());
    }
}
