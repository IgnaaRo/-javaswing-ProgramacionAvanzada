/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEjemplo extends JFrame {

    public FlowLayoutEjemplo() {
        setTitle("FlowLayout");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        for (int i = 1; i <= 5; i++) {
            add(new JButton("Botón " + i));
        }
    }

    public static void main(String[] args) {
        new FlowLayoutEjemplo().setVisible(true);
    }
}