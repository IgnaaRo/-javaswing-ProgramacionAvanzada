/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

public class PanelesEjemplo extends JFrame {

    public PanelesEjemplo() {
        setTitle("Paneles");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Nombre:"));
        panelSuperior.add(new JTextField(10));

        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Aceptar"));
        panelInferior.add(new JButton("Cancelar"));

        setLayout(new BorderLayout());
        add(panelSuperior, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new PanelesEjemplo().setVisible(true);
    }
}