/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEjemplo extends JFrame {

    public GridLayoutEjemplo() {
        setTitle("GridLayout");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            add(new JButton("" + i));
        }
    }

    public static void main(String[] args) {
        new GridLayoutEjemplo().setVisible(true);
    }
}