package study_set;

import main.Main;

import java.nio.file.Path;
import javax.swing.JFileChooser;
import java.io.File;

public class StudySetLoader {
    public Path getFileFromUser() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(Main.getWindow());
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            return Path.of(selectedFile.getAbsolutePath());
        } else {
            return null;
        }
    }
}
