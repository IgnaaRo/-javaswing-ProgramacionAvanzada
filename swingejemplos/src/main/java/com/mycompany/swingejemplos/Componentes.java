/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

public class Componentes extends JFrame {

    public Componentes() {
        setTitle("Componentes");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nombre:"));
        add(new JTextField(15));
        add(new JButton("Enviar"));
    }

    public static void main(String[] args) {
        new Componentes().setVisible(true);
    }
}