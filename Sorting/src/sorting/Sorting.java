/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Deus Vult
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Methods metodos = new Methods();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de valores a ordenar: "));
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10)+1;
        }
        JOptionPane.showMessageDialog(null, "Algoritmos de ordenamiento\n"
                + "Vector original: \n"+Arrays.toString(vector)+"\n"
                + "Burbuja: \n"+metodos.bubbleSort(vector)+"\n"
                + "Selección: \n"+metodos.selectionSort(vector)+"\n"
                + "Inserción: \n"+metodos.insertionSort(vector));
    }
    
}
