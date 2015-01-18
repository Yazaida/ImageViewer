package application;

import control.MapCommand;
import control.NextImageCommand;
import control.PrevImageCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Image;
import persistence.ImageFileListLoader;
import ui.swing.ActionListenerFactory;
import ui.swing.ApplicationFrame;

public class Application {

    static final String Path = "C:\\Users\\YazaidaMaría\\Pictures\\Imagenes";

    public static void main(String[] args) {
        new Application().execute();
    }

    private void execute() {
        final MapCommand mapCommand = new MapCommand();
        ImageFileListLoader imageLoaderFileList = new ImageFileListLoader(Path);
        Image[] listImages = imageLoaderFileList.load();
        ActionListenerFactory actionListenerFactory = new ActionListenerFactory() {
            @Override
            public ActionListener create(final String name) {
                return new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mapCommand.get(name).execute();

                    }
                };
            }
        };
        ApplicationFrame frame = new ApplicationFrame(actionListenerFactory);
        frame.getImageDisplay().setImage(listImages[0]);
        mapCommand.put("next", new NextImageCommand(frame.getImageDisplay()));
        mapCommand.put("prev", new PrevImageCommand(frame.getImageDisplay()));
        frame.setVisible(true);
    }
}
