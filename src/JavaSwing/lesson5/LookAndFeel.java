package JavaSwing.lesson5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LookAndFeel {
    public static void main(String[] args) {
        JFrame frame = getFrame();

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button1 = new JButton("Metal");
        JButton button2 = new JButton("Nimbus");
        JButton button3 = new JButton("CDE/Motif");
        JButton button4 = new JButton("Windows");
        JButton button5 = new JButton("Windows Classic");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel\n");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel\n");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel\n");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel\n");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel\n");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
//       UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels(); // Для просмотра дефолтных фонов
//       for(UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos){
//           System.out.println(lookAndFeelInfo.getName());
//           System.out.println(lookAndFeelInfo.getClassName());
//
    }

    static JFrame getFrame() {
        JFrame frame = new JFrame() {};
        frame.setTitle("Just message!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return frame;
    }
}





