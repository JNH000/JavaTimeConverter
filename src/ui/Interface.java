package ui;

import system.SystemManager;
import system.Time;

import javax.swing.*;
import java.awt.*;

public class Interface {

    public static Color uiColor = new Color(0x1e2733);
    public static Color textColor = new Color(0x7ca296);
    public static Color btnColor = new Color(0x496c88);

    private static String version = "v.0.0.1";
    String[] timeZones = {"GMT", "UTC", "EST", "CST", "PST", "CAT", "..."};

    private JFrame jFrame = new JFrame();
    private JPanel jPanel = new JPanel();
    public static JLabel uiText = new JLabel("", SwingConstants.CENTER);
    private JComboBox<String> jComboBox = new JComboBox<>(timeZones);


    private Time time = new Time();


    public Interface(){
        jPanel.setLayout(new BorderLayout());
        jFrame.getContentPane().setBackground(uiColor);

        jFrame.setTitle("Java Time Converter " + version);

        jComboBox.setBounds(80, 59, 140, 20);
        jComboBox.setBackground(uiColor);
        jComboBox.setFont(new Font("Verdana", 1, 20));
        jComboBox.setForeground(textColor);

        uiText.setFont(new Font("Verdana", 1, 50));
        uiText.setForeground(textColor);
        jPanel.setOpaque(false);
        jPanel.add(jComboBox, BorderLayout.PAGE_END);
        jPanel.add(uiText, BorderLayout.CENTER);
        jFrame.add(jPanel);

        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }




}
