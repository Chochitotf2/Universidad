/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author PotatoPower
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo: "));
        int[] array = new int[x];
        
        int pares = 0, impares = 0;        
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            if (array[i]%2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }
        String cadena = "";
        
        cadena += "Burbuja: "+Metodos.bubbleSort(array)+"\n"
                + "Selección: "+Metodos.selectionSort(array)+"\n"
                + "Inserción: "+Metodos.insertionSort(array)+"\n";  
        
        int[] par = new int[pares], impar = new int[impares];
        int cont1 = 0, cont2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                par[cont1] = array[i];
                cont1++;
            }else{
                impar[cont2] = array[i];
                cont2++;
            }
        }
        
        par = Metodos.quickSort(par);
        impar = Metodos.quickSort(impar);
        
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < pares) {
                array[i] = par[i];
            }else{
               array[i] = impar[cont];
               cont++;
            }
        }
        
        cadena += "QuickSort: "+Arrays.toString(array);
        
        JOptionPane.showMessageDialog(null, cadena);  
    }
    
}
