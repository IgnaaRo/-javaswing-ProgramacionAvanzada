/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingejemplos;

import javax.swing.*;

public class JOptionPaneEjemplo {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Mensaje de prueba");

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        int opcion = JOptionPane.showConfirmDialog(null, "¿Continuar?");

        System.out.println(nombre + " - Opción: " + opcion);
    }
}