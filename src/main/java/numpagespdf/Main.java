package numpagespdf;

import swing.Chooser;
import swing.GUI;
import swing.UserInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main implements ActionListener {
    File[] files;

    public static void main(String[] args) {
        GUI gui = new UserInterface();
        gui.showPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.getFilePath();
    }

    public void getFilePath() {
        Chooser chooser = new Chooser();
        files = chooser.getFilesPath();
        this.numberThePages();
    }

    public void numberThePages() {
        if (files.length != 0) {
            for (File file : files) {
                String source = file.toString();
                String dest = source.substring(0, (source.length() - 4)) + "_num.pdf";
                NumeratorPDF numerator = new NumeratorPDF();
                try {
                    numerator.execute(source, dest);
                } catch (IOException e) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame,
                            "Ошибка нумерации!",
                            "Ошибка!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "Нумерация успешно завершена.",
                    "Сообщение!", JOptionPane.INFORMATION_MESSAGE);
        }
        /*Пример уведомления*/
//        JFrame frame = new JFrame();
//        JOptionPane.showMessageDialog(frame,
//                "Eggs are not supposed to be green.");
    }
}
