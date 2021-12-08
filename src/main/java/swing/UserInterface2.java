package swing;

import numpagespdf.Main;

import javax.swing.*;
import java.awt.*;


public class UserInterface2 implements GUI {


    public void showPanel() {
        JFrame frame = new JFrame("Нумератор страниц отчетов v1.0 (Made by Haliz)");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Для нумерации отчетов, выберете один или несколько "
                + "сгенерированных ForApp файлов в формате PDF.", SwingConstants.CENTER);
        frame.add(panel);
        JButton button = new JButton("Выбрать");
        panel.add(label);
        panel.add(button);
        button.addActionListener(new Main());
        JLabel label2 = new JLabel("Да пребудет с вами сила!", SwingConstants.CENTER);
        panel.add(label2);
        frame.setBounds(500, 300, 800, 150);
        frame.setVisible(true);
    }
}
