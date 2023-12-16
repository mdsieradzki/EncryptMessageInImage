package View.Buttons;

import javax.swing.JButton;
import javax.swing.JFileChooser;

public class InputImageButton extends JButton {
    public InputImageButton() {
        setText("Test");
        addActionListener(e -> savePathToFile());
    }

    private void savePathToFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file to save the path");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(selectedFilePath);
        }
    }
}
