/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.JFrame;

public class VentanaBasica extends JFrame {

    public VentanaBasica() {
        setTitle("Ventana Básica");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new VentanaBasica().setVisible(true);
    }
}