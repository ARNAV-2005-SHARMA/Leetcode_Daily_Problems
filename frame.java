import java.awt.*;
import java.awt.Container;

import javax.swing.*;
public class frame {
    public static void main(String args[]){
        JFrame frame = new JFrame(); //by default set as false
        frame.setVisible(true);
        frame.setSize(500,350);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("logo.jpeg");
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);

        Container c = frame.getContentPane();
        c.setBackground(Color.BLUE);
        //frame.setBounds(100, 500, 400, 500);

        frame.setTitle("WhatsApp");
    }
}
