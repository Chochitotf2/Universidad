/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

import javax.swing.JOptionPane;

/**
 *
 * @author gvcx
 */
public class Ascensor_Principal {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas:"));
        int y = 0;
        do{            
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso:"));
            if (y >= 5 && y <= 10) {
                Ascensor ascensor = new Ascensor(x);
                ascensor.sb(y);

                JOptionPane.showMessageDialog(null, ascensor.getestado()+"\n"
                        + "Restantes: "+ascensor.getrestantes());
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un piso mayor o igual a 5 y menor o igual a diez.");
            }
        }while(y < 5 || y > 10);
        
    }
}
