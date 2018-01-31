/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author Deus Vult
 */
public class Methods { 
    public String bubbleSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j+1]) {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        return Arrays.toString(vector);
    }
    
    public String selectionSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int menor = vector[i], pos = 0;
            for (int j = i+1; j < vector.length; j++) {
                if (menor > vector[j]) {
                    menor = vector[j];
                    pos = j;
                }
            }
            if (vector[i] > menor) {
                int aux = vector[i];
                vector[i] = menor;
                vector[pos] = aux;
            }
        }
        return Arrays.toString(vector);
    }
    
    public String insertionSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int aux = vector[i], j = i;
            while (j > 0 && aux < vector[j-1]) {
                vector[j] = vector[j-1];
                j--;
            }
            vector[j] = aux;
        }
        return Arrays.toString(vector);
    }
}
