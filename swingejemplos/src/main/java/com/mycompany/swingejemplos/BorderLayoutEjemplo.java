/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEjemplo extends JFrame {

    public BorderLayoutEjemplo() {
        setTitle("BorderLayout");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(new JButton("NORTE"), BorderLayout.NORTH);
        add(new JButton("SUR"), BorderLayout.SOUTH);
        add(new JButton("ESTE"), BorderLayout.EAST);
        add(new JButton("OESTE"), BorderLayout.WEST);
        add(new JButton("CENTRO"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new BorderLayoutEjemplo().setVisible(true);
    }
}