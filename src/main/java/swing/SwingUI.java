package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SwingUI extends JFrame {
    private JButton button = new JButton("Кнопка");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton radioButton1 = new JRadioButton("Select this");
    private JRadioButton radioButton2 = new JRadioButton("Select that");
    private JCheckBox checkBox = new JCheckBox("check", false);

    public SwingUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        container.add(radioButton1);
        radioButton1.setSelected(true);
        container.add(radioButton2);
        container.add(checkBox);
//        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
//    class ButtonEventListener implements ActionListener
}

