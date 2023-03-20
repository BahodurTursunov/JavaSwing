package JavaSwing.lesson2;

//2 lesson, learning to draw

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Font font = new Font("", Font.BOLD, 20);
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // эта команда предназначена для показа всех доступных стилей в винде
//        for (String s : fonts) {
//            System.out.println(s);
//        }
    }

    static JFrame getFrame() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return frame;
    }
}

