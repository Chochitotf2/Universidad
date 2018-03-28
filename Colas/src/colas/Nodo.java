/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author 
 * @param <T>
 */
public class Nodo <T>{
    private T dato;
    private Nodo siguiente;
    
    public Nodo(T dato){
        this.dato = dato;
    }
    
    public void setSiguiente(T dato){
        siguiente = new Nodo(dato);
    }
    
    public void setSiguienteObj(Nodo next){
        this.siguiente = next;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public T getDato(){
        return dato;
    }
}
