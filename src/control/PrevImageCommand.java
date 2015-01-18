package control;

import ui.ImageDisplay;

public class PrevImageCommand implements Command {

    ImageDisplay imageViewer;

    public PrevImageCommand(ImageDisplay imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void execute() {
        imageViewer.setImage(imageViewer.getImage().getPrev());
    }

}
