/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Kristina
 */
public class Ventana1 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JPanel> jPanelPrincipal;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JComboBox> jComboBoxList;
    private List<JButton> jButtonList;

    public Ventana1(String title) throws HeadlessException {
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

        jPanelPrincipal = new ArrayList<>();
        this.jPanelPrincipal.add(new JPanel());
        this.jPanelPrincipal.add(new JPanel());
        
       
        this.jPanelPrincipal.get(0).setLayout(new BorderLayout());
        this.jPanelPrincipal.get(0).setBorder(new MatteBorder(4,4,4,4,Color.lightGray) );
        this.jPanelPrincipal.get(0).add(this.jPanelPrincipal.get(1), BorderLayout.CENTER);
     
        this.jPanelPrincipal.get(1).setBackground(Color.white);
        this.jPanelPrincipal.get(1).setLayout(new BorderLayout());
        this.jPanelPrincipal.get(1).setBorder(new CompoundBorder( new EtchedBorder(),new LineBorder(Color.lightGray) ));
        
        jPanelList = new ArrayList<>();
        for (int x = 0; x < 6; x++) {
            this.jPanelList.add(new JPanel());      
        }      
        
        this.jPanelPrincipal.get(1).add(this.jPanelList.get(0));
        
        this.jPanelList.get(0).setLayout(new GridLayout(6, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        
        this.jPanelList.get(1).setBackground(Color.darkGray);
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel(" INSCRIBETE "));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));
        this.jLabelList.add(new JLabel(" Selecione una sede: "));
        this.jLabelList.add(new JLabel(" Tipo Documento: "));
        this.jLabelList.add(new JLabel(" Ingrese su identificación: "));
        
        jLabelList.get(1).setOpaque(true);
        jLabelList.get(1).setHorizontalAlignment(SwingConstants.LEFT);
        jLabelList.get(2).setOpaque(true);
        jLabelList.get(2).setHorizontalAlignment(SwingConstants.LEFT);
        jLabelList.get(3).setOpaque(true);
        jLabelList.get(3).setHorizontalAlignment(SwingConstants.LEFT);
      
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(10));

        this.jPanelList.get(1).add(this.jLabelList.get(0), BorderLayout.CENTER);      
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(0));
        
 
    }

    public void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        var listaSede = new String[3];
        listaSede[0] = "Cuenca";
        listaSede[1] = "Quito";
        listaSede[2] = "Guayaquil";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSede)));

        var listaTipoDoc = new String[2];
        listaTipoDoc[0] = "Cedula";
        listaTipoDoc[1] = "Pasaporte";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaTipoDoc)));
        this.jComboBoxList.add(new JComboBox());

        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList.get(1));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jPanelList.get(5).add(this.jButtonList.get(0));
    }

}
