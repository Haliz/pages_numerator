package swing;

import numpagespdf.Main;

import javax.swing.*;


public class UserInterface implements GUI {
    public  void showPanel() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Нумератор страниц отчетов v1.0 (Made by Haliz)");
        frame.setBounds(500, 300, 900, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel label = new JLabel("Для нумерации отчетов, выберете один или несколько "
                + "сгенерированных ForApp файлов в формате PDF.", SwingConstants.CENTER);
        frame.add(panel);
        panel.add(label);
        JButton button = new JButton("Выбрать");
        panel.add(button);
        button.addActionListener(new Main());
    }

}
