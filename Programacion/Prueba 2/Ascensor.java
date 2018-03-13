/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg2;

/**
 *
 * @author Deus Vult
 */
public class Ascensor {
    int[] pisos = new int[6];
    int personas;
    
    public Ascensor(int cantidad){
        personas = cantidad;
    }
    
    public int seBajan(int piso){
        int random = (int) (Math.random()*personas)+1;
        if (piso != 5) {           
            pisos[(piso+1)-(pisos.length)] += random;
            personas -= random; 
        }else{
            pisos[0]++;
            personas--;
            random = 1;
        }       
        
        return random;
    }
    
    public String getEstado(){
        String cadena = "";
        int aux = 5;
        for (int piso : pisos) {
            cadena += "Piso "+aux+": "+piso+"\n";
            aux++;
        }
        return cadena;
    }
    
    public int getRestantes(){
        return personas;
    }
}
