/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varios;

/**
 *
 * @author PotatoPower
 */
public class Trabajadores {
    String[] trabajadores;
    double[] sueldo;
    double vextra;
    double extra;    
    int[] dias;
    int dias_extra;
    
    int cont_dias;   
    
    public Trabajadores(int dim, double vextra){
        trabajadores = new String[dim];
        sueldo = new double[dim];
        dias = new int[dim];
        this.vextra = vextra;
    }
    
    public void setNombre(int pos, String nombre){
        trabajadores[pos] = nombre;
    }
    
    public void setSueldo(int pos, double sueldo){
        this.sueldo[pos] = sueldo;
    }
    
    public void setDias(int pos, int dias){
        this.dias[pos] = dias;
    }
    
    public double getPago(int pos){
        double total = 0;
        int cont = 0, aux = 0;
        dias_extra = 0;
        extra = 0;
        cont_dias = 0;
        while(cont < dias[pos]){
            if (aux < 5) {
                total += sueldo[pos];
                aux++;
                cont_dias++;
            }else if(aux == 5){
                total += vextra;
                extra += vextra;
                dias_extra++;
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
            double pago = getPago(i);
            cadena += "Valor días extra: "+vextra+"\n\n"
                    + "Trabajador #"+(i+1)+" \n"
                    + "Nombre: "+trabajadores[i]+"\n"
                    + "Días ingresados: "+dias[i]+"\n"
                    + "Días Normales: "+cont_dias+"\n"
                    + "Días extra: "+dias_extra+"\n"
                    + "Días de descanso: "+(dias[i]-cont_dias-dias_extra)+"\n"
                    + "Sueldo: "+sueldo[i]+"\n"
                    + "Pago normal: "+(cont_dias*sueldo[i])+"\n"
                    + "Pago extra: "+extra+"\n"
                    + "Pago Total: "+pago+"\n\n";
        }
        return cadena;
    }
}
