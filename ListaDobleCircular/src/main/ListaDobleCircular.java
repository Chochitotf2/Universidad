/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class ListaDobleCircular<T> {
    private Nodo nodo;
    
    //Añade el primer nodo a la lista
    private void addFirstElement(T dato){
        nodo = new Nodo(dato);
        nodo.setNext(nodo);
        nodo.setPrev(nodo);
    }
    
    //Añade un nodo al final de la lista
    public void addToEnd(T dato){
        if (nodo == null){ 
            this.addFirstElement(dato);
        }else{
            Nodo aux = nodo.getPrev();
            nodo.setPrev(new Nodo(dato));
            aux.setNext(nodo.getPrev());
            nodo.getPrev().setPrev(aux);
            nodo.getPrev().setNext(nodo);
        }
    }
    
    //Añade un nodo al inicio de la lista
    public void addToStart(T dato){
        if (nodo == null) {
            this.addFirstElement(dato);
        }else{
            this.addToEnd(dato);
            nodo = nodo.getPrev();
        }
    }
    
    //Devuelve el tamaño de la lista
    public int size(){
        if (nodo == null) 
            return 0;
        else
            return size(nodo);
    }
    
    //Añade un nodo despues del nodo de referencia
    public void addNextTo(T ref, T dato){
        if (nodo == null) 
           this.addFirstElement(dato);
        else{
           Nodo nRef = getNode(ref, nodo);
            if (nRef != null) {
                Nodo aux = nRef.getNext();
                nRef.setNext(new Nodo(dato));
                aux.setPrev(nRef.getNext());
                nRef.getNext().setNext(aux);
                nRef.getNext().setPrev(nRef);
            }else
                System.out.println("Elemento no encontrado.");
        }
    }
    
    
    //Añade un nodo antes del nodo de referencia
    public void addPreviousTo(T ref, T dato){
        if (nodo == null) 
            this.addFirstElement(dato);
        else{
            Nodo nRef = getNode(ref, nodo);
            if (nRef != null) {
                Nodo aux = nRef.getPrev();
                nRef.setPrev(new Nodo(dato));
                aux.setNext(nRef.getPrev());
                nRef.getPrev().setPrev(aux);
                nRef.getPrev().setNext(nRef);
            }else
                System.out.println("Elemento no encontrado.");
        }
    }
    
    //Obtiene un nodo dado como referencia
    private Nodo getNode(T ref, Nodo nodo){
        if (nodo.getNext() != this.nodo) {
            if (nodo.getInfo() == ref)
                return nodo;
            else
                return getNode(ref, nodo.getNext()); 
        }else
            if (nodo.getInfo() == ref)            
                return nodo;
            else
                return null;
    }
    
    //Elimina el primer nodo de la lista
    public void removeFirst(){
        if (nodo == null)
            System.out.println("No hay elementos en la lista.");
        else{
            if (size() > 1) {
                nodo.getNext().setPrev(nodo.getPrev());
                nodo.getPrev().setNext(nodo.getNext());
                nodo = nodo.getNext();
            }else
                nodo = null;
        }
    }
    
    //Elimina el último nodo de la lista
    public void removeLast(){
        if (nodo == null) 
            System.out.println("No hay elementos en la lista.");
        else{
           if (size() > 1) {
                nodo.setPrev(nodo.getPrev().getPrev());
                nodo.getPrev().setNext(nodo);
            }else
                nodo = null; 
        }
    }
    
    //Elimina un nodo dado como referencia
    public void remove(T dato){
        if (nodo == null) 
            System.out.println("No hay elementos en la lista.");
        else{
            Nodo aux = getNode(dato, nodo);
            if (aux != null) {
                if (size() > 1) {
                    aux.getPrev().setNext(aux.getNext());
                    aux.getNext().setPrev(aux.getPrev());
                    System.out.println("Elemento eliminado.");
                }else{
                    nodo = null;
                    System.out.println("Elemento eliminado.");
                }                    
            }else
                System.out.println("Dato no encontrado.");  
        }
    }
    
    //Elimina el nodo de acuerdo al indice dado (0 - n)
    public void remove(int index){
        if (nodo == null) 
            System.out.println("No hay elementos en la lista.");
        else{
           Nodo aux = get(index);
            if (aux != null) {
                if (size() > 1) {
                    aux.getPrev().setNext(aux.getNext());
                    aux.getNext().setPrev(aux.getPrev());
                    System.out.println("Elemento eliminado.");
                }else{
                    System.out.println("Elemento eliminado.");
                    nodo = null;
                }                    
            }else
                System.out.println("Dato no encontrado."); 
        }
    }
    
    //Obtiene un nodo de acuerdo a su indice (0 - n)
    public Nodo get(int index){
        if (index + 1 > size()) {
            System.out.println("El indice está fuera del tamaño.");
            return null;
        }else
            return get(index, nodo);
    }
    
    //Obtiene un nodo de acuerdo a la referencia dada
    public Nodo get(T ref){
        return getNode(ref, nodo);
    }
    
    //Devuelve un String con los elementos de la lista
    public String print(){
        if (nodo == null) 
            return "Lista sin elementos.";
        else
            return "Ant | Nodo | Sig \n" + print(nodo);        
    }
    
    //Obtiene un nodo de acuerdo al indice dado
    private Nodo get(int index, Nodo nodo){
        if (index != 0)
            return get(index - 1, nodo.getNext());
        else
            return nodo;        
    }
    
    //Recorre la lista armando un String con los elementos que contiene
    private String print(Nodo nodo){
        if (nodo.getNext() != this.nodo) 
            return nodo.getPrev().getInfo() + " | " + nodo.getInfo() + " | " + nodo.getNext().getInfo()
                    + "\n" + print(nodo.getNext());
        else
            return nodo.getPrev().getInfo() + " | " + nodo.getInfo() + " | " + nodo.getNext().getInfo();        
    }
    
    //Recorre la lista sumando 1, por cada elemento de la lista
    private int size(Nodo nodo){
        if (nodo.getNext() != this.nodo) 
            return 1 + size(nodo.getNext());
        else
            return 1;
    }
}
