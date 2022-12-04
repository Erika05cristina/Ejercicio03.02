/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

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
        this.setSize(700, 260);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.crearPaneles();
        this.iniciarJTextFields();
        this.iniciarCombos();
        this.setContentPane(this.jPanelPrincipal.get(0));
        this.setVisible(true);
    }

    private void crearPaneles() {
        jPanelPrincipal = new ArrayList<>();
        this.jPanelPrincipal.add(new JPanel());
        this.jPanelPrincipal.add(new JPanel());

        this.jPanelPrincipal.get(0).setLayout(new BorderLayout());
        this.jPanelPrincipal.get(0).setBorder(new MatteBorder(4, 4, 4, 4, Color.lightGray));
        this.jPanelPrincipal.get(0).add(this.jPanelPrincipal.get(1), BorderLayout.CENTER);
        this.jPanelPrincipal.get(1).setBackground(Color.white);
        this.jPanelPrincipal.get(1).setLayout(new BorderLayout());

        jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.white)));

        for (int x = 1; x < 4; x++) {
            this.jPanelList.add(new JPanel());
            this.jPanelList.get(x).setBackground(Color.white);
            this.jPanelList.get(x).setBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.lightGray)));
        }

        this.jPanelPrincipal.get(1).add(this.jPanelList.get(0), BorderLayout.WEST); //Se agrega al panel principal 1 el panel 0
        this.jPanelList.get(0).setLayout(new GridLayout(3, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));

    }

    private void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" Sede: "));
        this.jLabelList.add(new JLabel(" Campus: "));
        this.jLabelList.add(new JLabel(" Carrera: "));
        this.jLabelList.add(new JLabel(" Código Del Proyecto: "));
        this.jLabelList.add(new JLabel(" Modalidad: "));
        this.jLabelList.add(new JLabel(" Periodo Academico: "));
        this.jLabelList.add(new JLabel(" Fecha Inico de Clases: 28/03/2022 "));

    }

    private void iniciarCombos() {
        this.jComboBoxList = new ArrayList<>();
        var listaSede = new String[3];
        listaSede[0] = "Cuenca";
        listaSede[1] = "Quito";
        listaSede[2] = "Guayaquil";
        this.jComboBoxList.add(new JComboBox(listaSede));

        var listaCampus = new String[3];
        listaCampus[0] = "El Vecino";
        listaCampus[1] = "Quito Metropolitano";
        listaCampus[2] = "Guayas";
        this.jComboBoxList.add(new JComboBox(listaCampus));
        
        var listaCarrera = new String[6];
        listaCarrera[0] = "Arquitectura";
        listaCarrera[1] = "Computacion";
        listaCarrera[2] = "Electricidad";
        listaCarrera[3] = "Odotologia";
        listaCarrera[4] = "Contabilidad";
        listaCarrera[5] = "Electrónica";
        this.jComboBoxList.add(new JComboBox(listaCarrera));
        
        var listaProyecto = new String[5];
        listaProyecto[0] = "Arquitectura-Rediseño";
        listaProyecto[1] = "Computacion-Rediseño";
        listaProyecto[2] = "Electricidad-Rediseño";
        listaProyecto[3] = "Odotologia-Rediseño";
        listaProyecto[4] = "Contabilidad-Rediseño";
        this.jComboBoxList.add(new JComboBox(listaProyecto));
        
        var listaModalidad= new String[4];
        listaModalidad[0] = "Presencial";
        listaModalidad[1] = "Virtual";
        listaModalidad[2] = "Híbrida";
        listaModalidad[3] = "Distancia";
        this.jComboBoxList.add(new JComboBox(listaModalidad));
        
        var listaPeriodo = new String[5];
        listaPeriodo[0] = "2022-2022";
        listaPeriodo[1] = "2021-2022";
        listaPeriodo[2] = "2021-2021";
        listaPeriodo[3] = "2020-2020";
        listaPeriodo[4] = "2019-2020";
        this.jComboBoxList.add(new JComboBox(listaPeriodo));
        
        this.jComboBoxList.add(new JComboBox());
        
//Se agrega los textos y los compbobox a los paneles 
        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jComboBoxList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(1).add(this.jComboBoxList.get(2));
        
        
        this.jPanelList.get(2).add(this.jLabelList.get(3));
        this.jPanelList.get(2).add(this.jComboBoxList.get(3));
        this.jPanelList.get(2).add(this.jLabelList.get(4));
        this.jPanelList.get(2).add(this.jComboBoxList.get(4));
        this.jPanelList.get(2).add(this.jLabelList.get(5));
        this.jPanelList.get(2).add(this.jComboBoxList.get(5));
        
        this.jPanelList.get(3).add(this.jLabelList.get(6));
        
    }

 
}
