package swing;

import javax.swing.*;


public class UserInterface {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Нумератор страниц отчетов(v1.0)");
        frame.setBounds(550, 250, 700, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        Icon clicker = new ImageIcon("src/main/java/swing/Expert.png");
        JLabel label = new JLabel("Для нумерации отчетов, выберете один или несколько "
                + "сгенерированных ForApp файлов в формате PDF.", SwingConstants.CENTER);
        frame.add(panel);
        panel.add(label);
        JButton button = new JButton("Выбрать");
        panel.add(button);
    }

}
