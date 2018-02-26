/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author PotatoPower
 */
public class Metodos {
    public static String bubbleSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j+1]) {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
                
                if (vector[j]%2 != 0 && vector[j+1]%2 == 0) {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        return Arrays.toString(vector);
    }
    
    public static String selectionSort(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            int menor = vector[i], pos = 0;
            if (menor%2 != 0) {
                int cont = i+1;
                while(cont < vector.length && vector[cont]%2 != 0  ){
                    cont++;
                }
                if (cont < vector.length) {
                    int aux = vector[i];
                    vector[i] = vector[cont];
                    vector[cont] = aux;
                    i--;
                }else{
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
            }else{
                for (int j = i+1; j < vector.length; j++) {
                    if (menor > vector[j] && vector[j]%2 == 0) {
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
            
        }
        return Arrays.toString(vector);
    }
    
    public static String insertionSort(int[] vector){
        for (int i = 1; i < vector.length; i++) {
            int aux = vector[i], j = i;
            if (aux%2 == 0) {
                while (j > 0 && (vector[j-1]%2 != 0 || aux < vector[j-1])) {
                    vector[j] = vector[j-1];
                    j--;
                }
            }else{
                while (j > 0 && aux < vector[j-1] && vector[j-1]%2 != 0) {
                    vector[j] = vector[j-1];
                    j--;
                }
            }
            
            vector[j] = aux;
        }
        return Arrays.toString(vector);
    }
    
    public static int[] quickSort(int[] array){
        int pivot = 0, punt = array.length - 1;
        while (pivot != punt) {  
            if (pivot < punt) {
                if (array[pivot] > array[punt]) {
                    int aux = array[pivot];
                    array[pivot] = array[punt];
                    array[punt] = aux;

                    aux = pivot;
                    pivot = punt;
                    punt = aux + 1;
                }else{
                    punt--;
                }
            }else{
               if (array[pivot] < array[punt]) {
                    int aux = array[pivot];
                    array[pivot] = array[punt];
                    array[punt] = aux;

                    aux = pivot;
                    pivot = punt;
                    punt = aux - 1;
                }else{
                    punt++;
                } 
            }
            
        }
        int dim1 = array.length - (pivot + 1);
        
        if (pivot > 1) {
            int[] arr1 = quickSort(Arrays.copyOf(array, pivot));
            for (int i = 0; i < arr1.length; i++) {
                array[i] = arr1[i];
            }
        }
        if (dim1 > 1) {
            int[] arr2 = quickSort(Arrays.copyOfRange(array, pivot+1, array.length));
            int cont = 0;
            for (int i = pivot + 1; i < array.length; i++) {
                array[i] = arr2[cont];
                cont++;
            }
        }
        return array;
    }
}
