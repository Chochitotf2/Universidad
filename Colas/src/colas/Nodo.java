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
    private Nodo next;
    
    public Nodo(T dato){
        this.dato = dato;
    }
    
    public void setNext(T dato){
        next = new Nodo(dato);
    }
    
    public void setNextObj(Nodo next){
        this.next = next;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public T getData(){
        return dato;
    }
}
