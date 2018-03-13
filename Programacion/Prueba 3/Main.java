/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Deus Vult
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores: "));
        int obra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días para completar la obra"));
        
        Trabajadores obreros = new Trabajadores(n, obra);
        
        for (int i = 0; i < n; i++) {
            obreros.setNombre(i, JOptionPane.showInputDialog("Ingrese el nombre del trabajador #"+(i+1)+":")); 
            obreros.setSueldo(i, Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor:")));
        }
        
        JOptionPane.showMessageDialog(null, obreros.presentar());
    }
    
}
