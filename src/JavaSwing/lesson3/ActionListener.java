package JavaSwing.lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionListener {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("submit");
        panel.add(button); // чтобы эта кнопка что-то делала, нам надо в button добавить ActionListener
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        }); // и нам нужно добавить в качестве аргумента анонимный класс


    }
    static JFrame getFrame() {
        JFrame frame = new JFrame(){ };
        frame.setTitle("Just message!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return frame;
    }
}

