package View;

import View.Panels.MainPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(String title) throws HeadlessException {
        super(title);
        getContentPane().add(new MainPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultSize();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void setDefaultSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int halfWidth = screenSize.width / 2;
        int halfHeight = screenSize.height / 2;
        setSize(halfWidth, halfHeight);
    }
}
