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
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class CrearGrupo extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelDerechoCont;
    private JPanel panelDerechoDivs;
    private JPanel panelIzquierdoCont;
    private JPanel panelIzquierdoDivs;
    private JPanel titulo;
    private JPanel inferior;
    private List<JPanel> listaPaneles;
    private List<JComboBox> jComboBoxList;
    private List<JComboBox> jComboBoxList1;
    private JCheckBox jCheckBox;
    private JTextField cajaGrande;
    private JTextField cajaPeque;
    private JLabel etiquetaTitulo;
    private List<JLabel> listaEtiquetasIzquierda;
    private List<JLabel> listaEtiquetasDerecha;
    private JButton botonGuardar;
    private JButton botonCancelar;

    public CrearGrupo() {
        setTitle("Crear Grupo");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        colocarComponentes();
    }

    private void colocarComponentes() {
        colocarPaneles();
        this.setContentPane(this.panelPrincipal);
        crearEtiqutas();
        ponerBotones();
        ponerTextField();
        ponerCombos();
        iniciarCheckBox();
        ponerCombo();
    }

    private void colocarPaneles() {

        panelPrincipal = new JPanel();
        panelDerechoCont = new JPanel();
        panelDerechoDivs = new JPanel();
        panelIzquierdoCont = new JPanel();
        panelIzquierdoDivs = new JPanel();

        titulo = new JPanel();
        inferior = new JPanel();
        listaPaneles = new ArrayList<>();
        // Formato de paneles
        panelPrincipal.setLayout(new BorderLayout());
        inferior.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        titulo.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        panelDerechoCont.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 15));
        panelIzquierdoCont.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 15));

        panelDerechoDivs.setLayout(new GridLayout(13, 1));
        panelIzquierdoDivs.setLayout(new GridLayout(13, 1));
        // Ubicación
        this.panelPrincipal.add(this.titulo, BorderLayout.NORTH);
        this.panelPrincipal.add(this.inferior, BorderLayout.SOUTH);
        this.panelPrincipal.add(this.panelDerechoCont, BorderLayout.CENTER);
        this.panelPrincipal.add(this.panelIzquierdoCont, BorderLayout.WEST);

        this.panelDerechoCont.add(this.panelDerechoDivs);
        this.panelIzquierdoCont.add(this.panelIzquierdoDivs);
        // Bordes
        panelDerechoCont.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                TitledBorder.DEFAULT_POSITION));
        panelIzquierdoCont.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                TitledBorder.DEFAULT_POSITION));

        // Color
        titulo.setBackground(new Color(32, 91, 218));
        titulo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                TitledBorder.DEFAULT_POSITION));

    }

    private void crearEtiqutas() {
        listaEtiquetasIzquierda = new ArrayList<>();
        listaEtiquetasDerecha = new ArrayList<>();
        etiquetaTitulo = new JLabel("Crear Grupo");

        // Izquierda
        listaEtiquetasIzquierda.add(new JLabel("Periodo Académica")); // 1
        listaEtiquetasIzquierda.add(new JLabel("Sede"));// 2
        listaEtiquetasIzquierda.add(new JLabel("Campus"));// 3
        listaEtiquetasIzquierda.add(new JLabel("Modalidad"));// 4
        listaEtiquetasIzquierda.add(new JLabel("Carrera"));// 5
        listaEtiquetasIzquierda.add(new JLabel("Código de proyecto"));// 6
        listaEtiquetasIzquierda.add(new JLabel("Asignatura"));// 7
        listaEtiquetasIzquierda.add(new JLabel("Nombre grupo"));// 8
        listaEtiquetasIzquierda.add(new JLabel("Cupos por grupo"));// 9
        listaEtiquetasIzquierda.add(new JLabel("Autorización calificación sobre 100 "));// 10
        listaEtiquetasIzquierda.add(new JLabel("Seleccionar Jornada"));// 11
        listaEtiquetasIzquierda.add(new JLabel("Oferta para estudiantes"));// 12
        listaEtiquetasIzquierda.add(new JLabel("Aplica cambio de grupo"));// 13
        // Derecha
        listaEtiquetasDerecha.add(new JLabel("2022-2022"));
        listaEtiquetasDerecha.add(new JLabel("Matriz Cuenca"));
        listaEtiquetasDerecha.add(new JLabel("El vecino"));
        listaEtiquetasDerecha.add(new JLabel("Presencial"));
        listaEtiquetasDerecha.add(new JLabel("Agropecuaria"));
        listaEtiquetasDerecha.add(new JLabel("Agropecuaria DISEÑO"));
        listaEtiquetasDerecha.add(new JLabel("BOTÁNICA"));

        // UBICACIÓN
        etiquetaTitulo.setForeground(Color.WHITE);
        this.titulo.add(this.etiquetaTitulo);
        for (int x = 0; x < 13; x++) {
            this.panelIzquierdoDivs.add(this.listaEtiquetasIzquierda.get(x));
            listaEtiquetasIzquierda.get(x).setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                    TitledBorder.DEFAULT_POSITION));
            

        }
        for (int i = 0; i < 7; i++) {
            this.panelDerechoDivs.add(this.listaEtiquetasDerecha.get(i));
            listaEtiquetasDerecha.get(i).setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED), "", TitledBorder.LEFT,
                    TitledBorder.DEFAULT_POSITION));
              }

    }

    private void ponerBotones() {
        botonCancelar = new JButton("Cancelar");
        botonGuardar = new JButton("Guardar");

        this.inferior.add(this.botonGuardar);
        this.inferior.add(this.botonCancelar);
    }

    private void ponerTextField() {

        cajaGrande = new JTextField("GRUPO 1-  ", 30);

        cajaPeque = new JTextField(" ", 10);

        this.panelDerechoDivs.add(this.cajaGrande);
        this.panelDerechoDivs.add(this.cajaPeque);

    }

    public void ponerCombos() {
        this.jComboBoxList = new ArrayList<>();
        var listaAutorizacion = new String[2];
        listaAutorizacion[0] = "SI";
        listaAutorizacion[1] = "NO";
        this.jComboBoxList.add(new JComboBox(listaAutorizacion));

        var listaJornada = new String[3];
        listaJornada[0] = "Matutina";
        listaJornada[1] = "Diurna";
        listaJornada[2] = "Nocturna";
        this.jComboBoxList.add(new JComboBox(listaJornada));
        this.jComboBoxList.add(new JComboBox());

        this.panelDerechoDivs.add(this.jComboBoxList.get(0));
        this.panelDerechoDivs.add(this.jComboBoxList.get(1));
    }
    
    public void iniciarCheckBox(){
 
        this.jCheckBox = new JCheckBox (" Nuevos "); 
        this.panelDerechoDivs.add(this.jCheckBox);
     
    }

    public void ponerCombo() {

        this.jComboBoxList1 = new ArrayList<>();
        var listaAutorizacion = new String[2];
        listaAutorizacion[0] = "NO";
        listaAutorizacion[1] = "SI";
        this.jComboBoxList1.add(new JComboBox(listaAutorizacion));
        this.jComboBoxList1.add(new JComboBox());

        this.panelDerechoDivs.add(this.jComboBoxList1.get(0));
      
    }
}
