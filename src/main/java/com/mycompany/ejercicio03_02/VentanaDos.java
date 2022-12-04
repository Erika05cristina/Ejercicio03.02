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
import java.awt.GridLayout;
import java.awt.image.ImageObserver;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class VentanaDos extends JFrame{
    private List<JPanel> jPanelList;
    private JPanel panelPrincipal;
    private JPanel subPanel;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
    

    public VentanaDos(){
        setTitle("Guardar Datos");
        setSize(700,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        iniciarComponentes();
    }

    private void iniciarComponentes(){
        crearPaneles();
        this.setContentPane(this.panelPrincipal);
        crearEtiquetas();

    }

    private void crearPaneles(){
        panelPrincipal = new JPanel();        
        subPanel = new JPanel();
        jPanelList = new ArrayList<>();
        

        for(int x=0;x<19;x++){
            jPanelList.add(new JPanel());
            
        }

        jPanelList.get(0).setBackground(new Color(32,91,218));
        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));
        panelPrincipal.setBackground(Color.WHITE);

        panelPrincipal.setLayout(new BorderLayout());
        
        this.panelPrincipal.add(this.subPanel, BorderLayout.CENTER);
        this.panelPrincipal.add(this.jPanelList.get(0), BorderLayout.NORTH);
        jPanelList.get(0).setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        
        subPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED),"Personal",TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION));        
        subPanel.setLayout(new GridLayout(9,2));

        
        
        //Colocar paneles en el subPanel
        for(int i=1;i<19;i++){
            subPanel.add(this.jPanelList.get(i));
            
        }
        /*jPanelList.get(1).setBackground(new Color(65,167,218));
        jPanelList.get(2).setBackground(new Color(65,67,218));
        jPanelList.get(3).setBackground(new  Color(89,167,118));
        jPanelList.get(4).setBackground(new  Color(5,167,218));
        */


    }

    private void crearEtiquetas(){
        jLabelList = new ArrayList<>();
        //Crear etiquetas
        
        jLabelList.add(new JLabel("DATOS PERSONALES"));
        jLabelList.get(0).setForeground(Color.WHITE);
        jLabelList.get(0).setFont(new Font("Calibri", Font.PLAIN, 20));

        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jLabelList.get(0).setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabelList.get(0).setVerticalAlignment(SwingConstants.CENTER);
        
        
        /* Creación de etiquetas */
        jLabelList.add(new JLabel("Apellidos"));
        jLabelList.add(new JLabel("Ortiz Terrenos"));
        jLabelList.add(new JLabel("Nombre"));
        jLabelList.add(new JLabel("Josue Benigno"));
        jLabelList.add(new JLabel("Nacionalidad"));
        jLabelList.add(new JLabel("Ecuatoriana"));
        jLabelList.add(new JLabel("Género"));
        jLabelList.add(new JLabel("Masculino"));
        jLabelList.add(new JLabel("Correo"));
        jLabelList.add(new JLabel("mortizo@yahoo.com"));
        jLabelList.add(new JLabel("Fecha de nacimiento"));
        jLabelList.add(new JLabel("01-09-1940"));
        jLabelList.add(new JLabel("Telf."));
        jLabelList.add(new JLabel("0783553543"));
        jLabelList.add(new JLabel("Celular"));
        jLabelList.add(new JLabel("0983456522"));
        jLabelList.add(new JLabel("Whats App"));
        jTextField = new JTextField("",23);
        

        //Colocar etiquetas
        
        for(int i=1; i<18; i++){
            this.jPanelList.get(i).add(this.jLabelList.get(i));
                      
        }
        
        this.jPanelList.get(18).add(jTextField);
        
        //Alineaciones
        




    }

    
}