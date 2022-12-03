/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kristina
 */
public class Ventana5 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JPanel> jPanelPrincipal;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JComboBox> jComboBoxList;
    private List<JButton> jButtonList;

    public Ventana5(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 260);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.crearPaneles();
        this.iniciarJTextFields();
        this.iniciarCombos();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelPrincipal.get(0));
        this.setVisible(true);
    }

    private void crearPaneles() {

    }

    private void iniciarJTextFields() {

    }

    private void iniciarCombos() {

    }

    private void iniciarJButtons() {

    }
}
