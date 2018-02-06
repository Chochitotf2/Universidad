/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_sort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author PotatoPower
 */
public class Quick_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión del array: "));
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));
        }
        
        JOptionPane.showMessageDialog(null, Arrays.toString(sort.theSort(array)));
    }
    
}
