/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PotatoPower
 */
public class Main {
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        
        //Añade al final de la lista
        lista.addToEnd("1");
        lista.addToEnd("2");
        lista.addToEnd("3");
        lista.addToEnd("4");
        
        //Añade al inicio de la lista
        lista.addToStart("0");
        
        //Devuelve un String con todos los elementos de la lista
        System.out.println(lista.print());
        //Devuelve el tamaño de la lista como entero
        System.out.println("Tamaño: "+lista.size());
        
        //Añade despues de
        lista.addNextTo("1", "a");
        //Añade antes de
        lista.addPreviousTo("3", "b");
        
        System.out.println("\n" + lista.print());
        System.out.println("Tamaño: "+lista.size());
        
        //Elimina el primer nodo
        lista.removeFirst();
        //Elimina el ultimo nodo
        lista.removeLast();
        
        System.out.println("\n" + lista.print());
        System.out.println("Tamaño: "+lista.size() + "\n");
        
        //Recupera el nodo del indice dado
        System.out.println("Elemento recuperado: " + lista.get(0).getInfo() + "\n");
        //Recupera el nodo dado como referencia
        System.out.println("Elemento recuperado: " + lista.get("3").getInfo() + "\n");
        
        //Elimina un nodo dado como referencia
        lista.remove("b");
        //Elimina un nodo del indice dado
        lista.remove(1);
        
        System.out.println("\n" + lista.print());
        System.out.println("Tamaño: "+lista.size());
        
        //Modifica el valor de un nodo
        lista.get(2).setInfo("4");
        System.out.println("\n" + lista.print());
        System.out.println("Tamaño: "+lista.size());
    }
    
}
