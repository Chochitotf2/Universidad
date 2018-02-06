/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_sort;

import java.util.Arrays;

/**
 *
 * @author PotatoPower
 */
public class QuickSort {
    public int[] theSort(int[] array){
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
            int[] arr1 = theSort(Arrays.copyOf(array, pivot));
            for (int i = 0; i < arr1.length; i++) {
                array[i] = arr1[i];
            }
        }
        if (dim1 > 1) {
            int[] arr2 = theSort(Arrays.copyOfRange(array, pivot+1, array.length));
            int cont = 0;
            for (int i = pivot + 1; i < array.length; i++) {
                array[i] = arr2[cont];
                cont++;
            }
        }
        return array;
    }
}
