package numpagespdf;

import swing.Chooser;
import swing.GUI;
import swing.UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

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
//        System.out.println(this);
        this.numberThePages();
    }

    public void numberThePages() {
        // TODO: 04.12.2021 Если не нулевой путь запускать нумератор.
    }

    @Override
    public String toString() {
        return "Main{"
                + "files=" + Arrays.toString(files)
                + '}';
    }
}
