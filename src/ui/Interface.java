package ui;

import system.SystemManager;
import system.Time;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Interface {

    public static Color uiColor = new Color(0x1e2733);
    public static Color textColor = new Color(0x7ca296);

    private static String version = "v.0.0.1";

    private JFrame jFrame = new JFrame();
    private JPanel jPanel = new JPanel();
    public static JLabel uiText = new JLabel("", SwingConstants.CENTER);

    private Time time = new Time();


    public Interface(){
        jFrame.setLayout(new GridBagLayout());
        jFrame.getContentPane().setBackground(uiColor);

        jFrame.setTitle("Java Time Converter" + version);

        uiText.setFont(new Font("Verdana", 1, 50));
        uiText.setForeground(textColor);
        jPanel.setOpaque(false);
        jPanel.add(uiText);
        jFrame.add(jPanel);

        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }




}
