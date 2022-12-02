/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio03_02;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Kristina
 */
public class Ventana1 extends JFrame {

    public Ventana1(String title) throws HeadlessException {
        super(title);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(rootPane);
        this.setVisible(true);
        
        
    }
    
}
