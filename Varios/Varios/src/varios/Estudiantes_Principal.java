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
public class Estudiantes_Principal {
    public static void main(String[] args) {
        int e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de materias: "));
        
        Estudiantes clase = new Estudiantes(e,m);
        
        for (int i = 0; i < e; i++) {
            clase.setEstudiante(i, JOptionPane.showInputDialog("Ingrese el nombre del estudiante #"+(i+1)+": "));
        }
        
        for (int i = 0; i < m; i++) {
            clase.setMateria(i, JOptionPane.showInputDialog("Ingrese el nombre de la materia #"+(i+1)+": ")); 
        }
        
        JOptionPane.showMessageDialog(null, clase.presentar());
    }
}
