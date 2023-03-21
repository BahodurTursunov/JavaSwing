package JavaSwing.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class EventHendler {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("submit");
        panel.add(button);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });
        button.addActionListener(EventHandler.create(ActionListener.class, frame, "title", "source.text")); //
        // EventHendler выполняет одну простую операцию
    }


    static JFrame getFrame() {
        JFrame frame = new JFrame(){};
        frame.setTitle("Just message!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return frame;
    }
}
