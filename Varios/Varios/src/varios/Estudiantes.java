/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author PotatoPower
 */
public class Estudiantes {
    String[] estudiantes;
    String[] materias;
    
    public Estudiantes(int e, int m){
        estudiantes = new String[e];
        materias = new String[m];
    }
    
    public double getPromedio(String materia, String estudiante){
        JOptionPane.showMessageDialog(null, "Ingrese las notas de "+materia+" para el estudiante "+estudiante);
        double prom = 0;
        for (int i = 1; i <= 3; i++) {
            prom += Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #"+i+": "));
        }
        return prom/3;
    }
    
    public void setEstudiante(int pos, String value){
        estudiantes[pos] = value;
    }
    
    public void setMateria(int pos, String value){
        materias[pos] = value;
    }
    
    public String presentar(){
        DecimalFormat df = new DecimalFormat("#.00");
        String cadena = "";
        for(String estudiante : estudiantes){
            cadena += "Nombre: "+estudiante+" - Puntajes:\n";
            for (String materia : materias) {
                double prom = getPromedio(materia, estudiante);
                cadena += materia+": "+df.format(prom)+" - ";
                if (prom >= 7) {
                    cadena += "Aprobado \n";
                }else if(prom < 7 && prom >= 5){
                    cadena += "Supletorio \n";
                }else{
                    cadena += "Reprobado \n";
                }
            }
            cadena += "\n";
        }
        return cadena;
    }
}
