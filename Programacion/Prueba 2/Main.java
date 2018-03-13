/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg2;

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
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas: "));
        
        Ascensor ascensor = new Ascensor(cantidad);
        
        do {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de piso: "));
            if (x >= 5 && x <= 10) {
                JOptionPane.showMessageDialog(null, "En este piso se bajaron: "+ascensor.seBajan(x)+"\n"
                    + "Personas que quedaron en el ascensor: "+ascensor.getRestantes()+"\n"
                    + "Estado de los ascensores:\n"
                            + ascensor.getEstado());
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un valor entre 5 y 10");
            }
            
        } while (ascensor.getRestantes() > 0);
        
        JOptionPane.showMessageDialog(null, "Terminado!\n"
                + ascensor.getEstado());
        
    }
    
}
