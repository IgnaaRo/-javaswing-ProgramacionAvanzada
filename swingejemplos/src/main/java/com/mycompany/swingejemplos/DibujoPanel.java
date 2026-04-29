/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;
import java.awt.*;

class PanelDibujo extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.ORANGE);
        g.fillOval(100, 100, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString("Sol", 130, 90);
    }
}

public class DibujoPanel extends JFrame {

    public DibujoPanel() {
        setTitle("Dibujo");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new PanelDibujo());
    }

    public static void main(String[] args) {
        new DibujoPanel().setVisible(true);
    }
}