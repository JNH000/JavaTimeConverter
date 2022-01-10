package ui;

import system.Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {

    private static final Color uiColor = new Color(0x1e2733);
    private static final Color textColor = new Color(0x7ca296);
    private static final Color btnColor = new Color(0x496c88);

    private static final String version = "v.0.0.1";
    static final String[] timeZones = {"GMT", "UTC", "EET", "ART", "EAT", "MET", "NET", "PLT",
            "IST", "BST", "VST", "CTT", "JST", "ACT", "AET", "HST", "AST",
            "PST", "PNT", "MST", "CST", "EST", "CNT", "AGT", "BET", "CAT"};

    private final JFrame jFrame = new JFrame();
    private final JPanel jPanel = new JPanel();
    public static JLabel uiText = new JLabel("", SwingConstants.CENTER);
    public static JLabel uiTextSmall = new JLabel("", SwingConstants.CENTER);
    private static JComboBox <String> jComboBox = new JComboBox<>(timeZones);


    private Time time = new Time();


    public Interface(){
        jPanel.setLayout(new BorderLayout());
        jFrame.getContentPane().setBackground(uiColor);

        jFrame.setTitle("Java Time Converter " + version);

        jComboBox.setBounds(80, 59, 140, 20);
        jComboBox.setBackground(uiColor);
        jComboBox.setFont(new Font("Verdana", 1, 20));
        jComboBox.setForeground(textColor);
        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getSelection();
            }
        });

        uiText.setFont(new Font("Verdana", 1, 50));
        uiText.setForeground(textColor);
        uiTextSmall.setFont(new Font("Verdana", 1, 20));
        uiTextSmall.setForeground(textColor);
        jPanel.setOpaque(false);
        jPanel.add(jComboBox, BorderLayout.PAGE_END);
        jPanel.add(uiText, BorderLayout.CENTER);
        jPanel.add(uiTextSmall, BorderLayout.NORTH);
        jFrame.add(jPanel);

        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }



    public static String getSelection(){
        return jComboBox.getSelectedItem().toString();
    }




}
