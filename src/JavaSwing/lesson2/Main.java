package JavaSwing.lesson2;

//2 lesson, learning to draw

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        JFrame frame = getFrame();
        frame.add(new MyComponent());
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // эта команда предназначена для показа всех доступных стилей в винде
//        for (String s : fonts) {
//            System.out.println(s);
//        }
    }

    static class MyComponent extends JComponent { // при рисовании мы переопределяем метод paintComponent
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Yu Gothic Medium", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g; // вот этот метод
            g2.setFont(font);
            g2.drawString("hello world!", 20, 20); // x and y это отступы
            Point2D p1 = new Point2D.Double(70,70); // для орисовки точки
            Point2D p2 = new Point2D.Double(170, 170); // для орисовки точки

            Line2D line2D = new Line2D.Float(p1,p2); // для прописовки линий и это координаты x1,y1,x2,y2 отвечают где рисовать линию
            g2.draw(line2D);
        }

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

