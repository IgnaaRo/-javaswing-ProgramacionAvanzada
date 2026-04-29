/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class EventosTexto extends JFrame {

    public EventosTexto() {
        setTitle("Evento Texto");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField campo = new JTextField(15);

        campo.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Texto cambiado");
            }
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Texto cambiado");
            }
            public void changedUpdate(DocumentEvent e) {}
        });

        add(campo);
    }

    public static void main(String[] args) {
        new EventosTexto().setVisible(true);
    }
}