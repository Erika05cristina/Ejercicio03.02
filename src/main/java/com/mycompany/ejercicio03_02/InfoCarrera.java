/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

/**
 *
 * @author Kristina
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class InfoCarrera extends JFrame {
    private JPanel panelInfoPrincipal;
    private JPanel subPanelInfo;
    private JPanel panelLateralCont;
    private JPanel panelLateral;
    private JPanel panelCentralCont;
    private JPanel panelCentral;
    private JPanel panelInferior;
    private JPanel panelTitulo;
    private List<JPanel> panelesMargenesLateral;
    private List<JPanel> panelesMargenesCentral;
    private List<JComboBox> jComboBoxList;
    private List<JLabel> jLabelListInfo;
    private JButton boton1;
    private JPanel panelMargenDerecho;

    public InfoCarrera() {
        setTitle("Información de la carrera");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        crearPaneles();
        this.setContentPane(this.panelInfoPrincipal);
        colocarEtiquetas();
        crearCombos();

    }

    private void crearPaneles() {
        panelesMargenesCentral = new ArrayList<>();
        panelesMargenesLateral = new ArrayList<>();
        panelInfoPrincipal = new JPanel();
        subPanelInfo = new JPanel();
        panelLateralCont = new JPanel();
        panelLateral = new JPanel();
        panelCentralCont = new JPanel();
        panelCentral = new JPanel();
        panelTitulo = new JPanel();
        panelInferior = new JPanel();
        boton1 = new JButton("Siguiente");
        panelMargenDerecho = new JPanel();

        // Divisiones
        panelInfoPrincipal.setLayout(new BorderLayout());
        subPanelInfo.setLayout(new BorderLayout());

        panelCentralCont.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
        panelLateralCont.setLayout(new FlowLayout(FlowLayout.LEFT,15,25));
        


        panelCentral.setLayout(new GridLayout(7, 1));
        panelLateral.setLayout(new GridLayout(7, 1));

        // Posicionamiento
        this.panelInfoPrincipal.add(this.subPanelInfo, BorderLayout.CENTER);
        this.panelInfoPrincipal.add(this.panelInferior, BorderLayout.SOUTH);

        this.subPanelInfo.add(this.panelTitulo, BorderLayout.NORTH);
        this.subPanelInfo.add(this.panelLateralCont, BorderLayout.WEST);
        this.subPanelInfo.add(this.panelCentralCont, BorderLayout.CENTER);
        this.subPanelInfo.add(this.panelMargenDerecho, BorderLayout.EAST);

        this.panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT,40,20));
        this.panelLateralCont.add(this.panelLateral);
        this.panelCentralCont.add(this.panelCentral);

        // Boton
        this.panelInferior.add(this.boton1);

        boton1.setBackground(new Color(32, 91, 218));
        boton1.setForeground(Color.WHITE);
        boton1.setSize(200, 150);

        
        
        // Borde
        subPanelInfo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                TitledBorder.DEFAULT_POSITION));
        panelTitulo.setBorder(new BevelBorder(BevelBorder.RAISED));
        boton1.setBorder(new BevelBorder(BevelBorder.RAISED));

        panelTitulo.setBackground(new Color(32, 91, 218));
        
        //Creación de margenes
        for(int z=0;z<7;z++){
            panelesMargenesLateral.add(new JPanel());
            panelesMargenesLateral.get(z).setLayout(new FlowLayout(FlowLayout.LEFT,0,15));
        }
        for(int i=0;i<7;i++){
            panelesMargenesCentral.add(new JPanel());
            panelesMargenesCentral.get(i).setLayout(new FlowLayout(FlowLayout.LEFT,0,12));
        }

        // Comprobación
        /*
         * 
         * panelInferior.setBackground(Color.GREEN);
         * subPanelInfo.setBackground(Color.ORANGE);
         * panelLateral.setBackground(Color.pink);
         */

    }

    private void colocarEtiquetas() {
        jLabelListInfo = new ArrayList<>();
        jLabelListInfo.add(new JLabel("Periodo Académico  "));
        jLabelListInfo.add(new JLabel("Carrera"));
        jLabelListInfo.add(new JLabel("Modalidad"));
        jLabelListInfo.add(new JLabel("Sede"));
        jLabelListInfo.add(new JLabel("Campus"));
        jLabelListInfo.add(new JLabel("Jornada"));
        jLabelListInfo.add(new JLabel("Fecha de registro"));

        jLabelListInfo.add(new JLabel("2022-2023"));
        jLabelListInfo.add(new JLabel("29/04/2022"));
        jLabelListInfo.add(new JLabel("INFORMACIÓN DE CARRERA"));
    

        // Posición
            //Lateral
        for(int x=0;x<7;x++){
            this.panelLateral.add(this.panelesMargenesLateral.get(x));
            this.panelesMargenesLateral.get(x).add(jLabelListInfo.get(x));
        }
        this.panelTitulo.add(jLabelListInfo.get(9));
        jLabelListInfo.get(9).setForeground(Color.WHITE);
        
        /*
        for (int i = 0; i < 7; i++) {
            this.panelLateral.add(jLabelListInfo.get(i));
            jLabelListInfo.get(i).setOpaque(true);
            //jLabelListInfo.get(i).setHorizontalAlignment(SwingConstants.CENTER);
            // jLabelListInfo.get(i).setBackground(Color.CYAN);

        }
        this.panelTitulo.add(jLabelListInfo.get(9));
        jLabelListInfo.get(9).setForeground(Color.WHITE);
        */

    }

    private void crearCombos() {
        jComboBoxList = new ArrayList<>();
        // Carrera
        var listaCarrera = new String[5];
        listaCarrera[0] = "Arquitectura";
        listaCarrera[1] = "Computacion";
        listaCarrera[2] = "Electricidad";
        listaCarrera[3] = "Odotologia";
        listaCarrera[4] = "Contabilidad";
        this.jComboBoxList.add(new JComboBox((new DefaultComboBoxModel(listaCarrera))));
        // Modalidad
        var listaModalidad = new String[3];
        listaModalidad[0] = "Virtual (Solo algunas materias)";
        listaModalidad[1] = "Presencial";
        listaModalidad[2] = "Hibrida";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaModalidad)));
        // Sede
        var listaSede = new String[3];
        listaSede[0] = "Cuenca";
        listaSede[1] = "Quito";
        listaSede[2] = "Guayaquil";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSede)));
        // Campus
        var listaCampus = new String[3];
        listaCampus[0] = "El Vecino";
        listaCampus[1] = "Quito Metropolitano";
        listaCampus[2] = "Guayas";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        // Jornada
        var listaJornada = new String[2];
        listaJornada[0] = "Diurna";
        listaJornada[1] = "Nocturna";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));

        /* ---- POSICIÓN --- */
        
        // this.panelCentral.add(jLabelListInfo.get(7));

        // this.panelCentral.add(this.jComboBoxList.get(c-1));
            //Central
        for(int j=0;j<7;j++){
            this.panelCentral.add(this.panelesMargenesCentral.get(j));
            
        }
        this.panelesMargenesCentral.get(0).add(jLabelListInfo.get(7));

        for (int c = 0; c < 5; c++) {
            this.panelesMargenesCentral.get(c+1).add(this.jComboBoxList.get(c));

        }
        this.panelesMargenesCentral.get(6).add(jLabelListInfo.get(8));

        //this.panelCentral.add(jLabelListInfo.get(8));

    }

}