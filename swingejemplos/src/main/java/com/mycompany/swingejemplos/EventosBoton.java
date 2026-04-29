/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosBoton extends JFrame {

    public EventosBoton() {
        setTitle("Evento Botón");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton boton = new JButton("Click");
        boton.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "¡Botón presionado!")
        );

        add(boton);
    }

    public static void main(String[] args) {
        new EventosBoton().setVisible(true);
    }
}