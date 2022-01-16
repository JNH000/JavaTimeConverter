package ui;

//region Imports
import system.Time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//endregion

public class Interface{


    //region Variables

    private static final Color uiColor = new Color(0x1e2733);
    private static final Color textColor = new Color(0x7ca296);
    private static final Color btnColor = new Color(0x496c88);

    private static final String version = "v.0.0.1";
    static final String[] timeZones = {"GMT", "UTC", "EET", "ART", "EAT", "MET", "NET", "PLT",
            "IST", "BST", "VST", "CTT", "JST", "ACT", "AET", "HST", "AST",
            "PST", "PNT", "MST", "CST", "EST", "CNT", "AGT", "BET", "CAT"};

    private final JFrame jFrame = new JFrame();
    public static JLabel uiText = new JLabel("", SwingConstants.CENTER);
    public static JLabel uiTextSmall = new JLabel("", SwingConstants.CENTER);
    private static JComboBox <String> jComboBox = new JComboBox<>(timeZones);

    private Time time = new Time();

    //endregion

    public Interface(){
        createJComboBox();
        createText();
        createJFrame();
    }

    //region UI Setup

    private void createText(){
        uiText.setFont(new Font("Verdana", 1, 50));
        uiText.setForeground(textColor);
        uiTextSmall.setFont(new Font("Verdana", 1, 20));
        uiTextSmall.setForeground(textColor);
    }

    private JComboBox createJComboBox(){
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
        return  jComboBox;
    }

    private JPanel createTextJPanel(JLabel uiText, JLabel uiTextSmall){
        JPanel panel = new JPanel(new BorderLayout());

        panel.setOpaque(false);

        panel.add(uiText, BorderLayout.CENTER);
        panel.add(uiTextSmall, BorderLayout.NORTH);

        return panel;
    }

    private JPanel createDropdownJPanel(JComboBox jComboBox){
        JPanel panel = new JPanel(new BorderLayout());

        panel.setOpaque(false);

        panel.add(jComboBox, BorderLayout.SOUTH);

        return panel;
    }

    private void createJFrame(){
        jFrame.getContentPane().setBackground(uiColor);
        jFrame.setTitle("Time Converter " + version);

        jFrame.add(createTextJPanel(uiText, uiTextSmall), BorderLayout.CENTER);
        jFrame.add(createDropdownJPanel(jComboBox), BorderLayout.SOUTH);

        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    //endregion


    public static String getSelection(){
        return jComboBox.getSelectedItem().toString();
    }




}
