/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.pkg3;

/**
 *
 * @author Deus Vult
 */
public class Trabajadores {
    String[] trabajadores;
    double[] sueldo;
    
    int dias;
    
    public Trabajadores(int dim, int dias){
        trabajadores = new String[dim];
        sueldo = new double[dim];
        
        this.dias = dias;
    }
    
    public void setNombre(int pos, String nombre){
        trabajadores[pos] = nombre;
    }
    
    public void setSueldo(int pos, double sueldo){
        this.sueldo[pos] = sueldo;
    }
    
    public double getPago(int pos){
        double total = 0;
        int cont = 0, aux = 0;
        while(cont < dias){
            if (aux < 5) {
                total += sueldo[pos];
                aux++;
            }else if(aux == 5){
                total += 20;
                aux++;
            }else{
                aux = 0;
            }
            cont++;
        }
        
        return total;
    }
    
    public String presentar(){
        String cadena = "";
        for (int i = 0; i < sueldo.length; i++) {
            cadena += "Trabajador #"+(i+1)+" \n"
                    + "Nombre: "+trabajadores[i]+"\n"
                    + "Sueldo: "+sueldo[i]+"\n"
                    + "Pago Total: "+getPago(i)+"\n\n";
        }
        return cadena;
    }
}
