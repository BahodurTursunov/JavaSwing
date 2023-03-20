package JavaSwing.lesson1;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // создание окна
        frame.setVisible(true); // setVisible делает окно видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation Для того чтобы можно было закрывать окно
        //frame.setSize(500,300); // setSize задает размер окну
        //frame.setLocation(500,200); // setLocation для того, чтобы окно появилось в центре или где нибудь, задаем сами
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit это набор инструментов для работы с нашими фреймами и приложениями
        Dimension dimension = toolkit.getScreenSize(); // из tollkit мы можем получить размер нашего окна
        frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300); // setBounds это совмещение setSize&setLocation // а dimension и значения которые мы дали в ширину и высоту дало нам окно прямо по середине
        frame.setTitle("This is my app"); // setTitle задает описание приложения/окна
    }
}