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
public class Ascensor {
    int [] pisos = new int [10];
    int personas;
    
    public Ascensor( int cantidad){
        personas = cantidad;
    }
    
    public void sb(int piso){
        int cont = 0;
        if (personas > 1) {
            while (cont < piso && personas > 0) {
                if (cont != 4) {
                    int random = (int)(Math.random()*personas)+1;
                    pisos[cont] = random;
                    personas -= random;
                    if (personas == 0 && cont < 4) {
                        pisos[cont]--;
                        if (pisos[cont] > 0) {
                            JOptionPane.showMessageDialog(null, "Piso "+(cont+1)+":\n"
                            + "Se bajaron: "+random+"\n"
                            + "Quedan: "+(personas+1));   
                        }
                        pisos[4]++;
                        JOptionPane.showMessageDialog(null, "Piso 5:\n"
                            + "Se bajaron: 1\n"
                            + "Quedan: "+personas);   
                    }else{
                        JOptionPane.showMessageDialog(null, "Piso "+(cont+1)+":\n"
                            + "Se bajaron: "+random+"\n"
                            + "Quedan: "+personas);   
                    }
                    cont++; 
                }else{
                    pisos[cont]++;
                    personas--;
                    JOptionPane.showMessageDialog(null, "Piso "+(cont+1)+":\n"
                            + "Se bajaron: 1\n"
                            + "Quedan: "+personas);
                    cont++; 
                }           
            }
        }else{            
            pisos[4] = 1;
            personas--;
            JOptionPane.showMessageDialog(null, "Piso 5: \n"
                            + "Se bajaron: "+1+"\n"
                            + "Quedan: "+personas);
        }          
    }
    
    public String getestado(){
        String cadena = "";
        int cont = 1;
        for (int piso: pisos) {
            cadena += "Piso " +cont+ ":" + piso+"\n";
            cont++;     
        }
        return cadena;
    }
    public int getrestantes(){
        return personas;
    }
}

