/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Arrays;

/**
 *
 * @author PotatoPower
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;            
        }
        
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            int aux = array[i], x = 0,  j = i;
            while (aux>0 && x<3) {                
                if (array[i]%aux == 0) {
                    x++;
                    aux--;
                }else{
                    aux--;
                }
            }
            aux = array[i];
            if (x == 2) {
                while(j > 0 && (j > cont || aux>array[j-1])){
                    array[j] = array[j-1];
                    j--;
                    /*if (j > cont) {
                        array[j]= array[j-1];
                        j--;
                    }else if (aux>array[j-1]) {
                        array[j] = array[j-1];
                        j--;
                    }*/
                }
                cont++;
            }else{
                while (j>0 && aux < array[j-1] && cont<j-1) {                    
                    array[j] = array[j-1];
                    j--;
                }
            }
            array[j] = aux;
        }
        
        System.out.println(Arrays.toString(array));
    }
    
}
