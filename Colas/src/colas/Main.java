/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author PotatoPower
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola cola = new Cola();
        
        cola.agregar(1);
        cola.agregar("Ella");
        cola.agregar("no");
        cola.agregar("Te");
        cola.agregar("Quiere");
        
        System.out.println(cola.tamaño()+"\n"
                + cola.recorrer());
        
        cola.borrar("no");
        System.out.println(cola.tamaño()+"\n"
                + cola.recorrer());
        
        cola.insertar(4, ":D");
        System.out.println(cola.tamaño()+"\n"
                + cola.recorrer());
    }
    
}
