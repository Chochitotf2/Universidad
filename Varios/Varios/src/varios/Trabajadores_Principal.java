/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import javax.swing.JOptionPane;

/**
 *
 * @author PotatoPower
 */
public class Trabajadores_Principal {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores: "));
        int obra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de los días extra: "));
        
        Trabajadores obreros = new Trabajadores(n, obra);
        
        for (int i = 0; i < n; i++) {
            obreros.setNombre(i, JOptionPane.showInputDialog("Ingrese el nombre del trabajador #"+(i+1)+":")); 
            obreros.setSueldo(i, Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del sueldo:")));
            obreros.setDias(i, Integer.parseInt(JOptionPane.showInputDialog("El tiempo en días:")));
        }
        
        JOptionPane.showMessageDialog(null, obreros.presentar());
    }
}
