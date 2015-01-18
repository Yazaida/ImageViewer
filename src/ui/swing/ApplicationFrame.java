
package ui.swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import ui.ImageDisplay;

public class ApplicationFrame extends JFrame{
    private ActionListenerFactory actionListenerFactory;
    private ImageDisplayPanel imageDisplay;

    public ApplicationFrame(ActionListenerFactory actionListenerFactory) {
        super("Image Viwer");
        this.actionListenerFactory = actionListenerFactory;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        createComponents();
    }

    public ActionListenerFactory getActionListenerFactory() {
        return actionListenerFactory;
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private void createComponents() {
        this.add(createJPanel());
        this.add(createToolBar(), BorderLayout.SOUTH);
    }

    private JPanel createJPanel() {
        ImageDisplayPanel panel = new ImageDisplayPanel();
        imageDisplay = panel;
        return panel;
    }

    private JPanel createToolBar() {
        JPanel toolbar = new JPanel();
        toolbar.add(createPrev(), BorderLayout.SOUTH);
        toolbar.add(createNext(), BorderLayout.SOUTH);
        return toolbar;
    }

    private JButton createPrev() {
        JButton jButton = new JButton("Prev");
        jButton.addActionListener(actionListenerFactory.create("prev") );
        return jButton;
    }

    private JButton createNext() {
        JButton jButton = new JButton("Next");
        jButton.addActionListener(actionListenerFactory.create("next") );
        return jButton;
    }
}
