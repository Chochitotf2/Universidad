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
public class Cola <T>{
    private Nodo nodo;
        
    public void agregar(T dato){
        if (!(nodo == null)) {
            agregar(nodo).setNext(dato);
        }else{
            nodo = new Nodo(dato);
        }
    }
    
    private Nodo agregar(Nodo nodo){
        if (nodo.getNext() == null) {
            return nodo;
        }else{
            return agregar(nodo.getNext());
        }
    }
    
    public void insertar(int pos, T dato){
        if (pos == 0) {
            Nodo aux = new Nodo(dato);
            aux.setNextObj(nodo);
            nodo = aux;
        }else{
            if (pos <= tamaño()) {
                Nodo aux = insertar(1, pos, nodo);
                Nodo item = new Nodo(dato);
                item.setNextObj(aux.getNext());
                insertar(1, pos, nodo).setNextObj(item);
            }else{
                System.out.println("La posición no existe");
            }
        }
    }
    
    private Nodo insertar(int cont, int pos, Nodo nodo){
        if (nodo.getNext() != null){
            if (cont == pos) {
                return nodo;
            }else{
                cont++;
                return insertar(cont, pos, nodo.getNext());
            }
        }else{
            return nodo;
        }            
    }
    
    public void borrar(T dato){
        if (dato == nodo.getData()) {
            nodo = nodo.getNext();
        }else{
            Nodo aux = borrar(dato,nodo);
            if (aux.getNext() != null) {
                borrar(dato,nodo).setNextObj(aux.getNext().getNext());
            }else{
                borrar(dato,nodo).setNextObj(null);
            }            
        }        
    }
    
    private Nodo borrar(T dato, Nodo nodo){
        if (nodo.getNext() != null) {
            if (dato == nodo.getNext().getData()) {
                return nodo;
            }else{
                return borrar(dato,nodo.getNext());
            } 
        }else{
            return nodo;
        }
                       
    }
    
    public int tamaño(){
        if (nodo == null) {
            return 0;
        }else{
            return tamaño(nodo);
        }
    }
    
    private int tamaño(Nodo nodo){
        if (nodo.getNext() == null) {
            return 1;
        }else{
            return 1 + tamaño(nodo.getNext());
        }
    }
    
    public String recorrer(){
        if (nodo == null) {
            return "Sin elementos";
        }else{
            return "[ "+recorrer(nodo);
        }
    }
    private String recorrer(Nodo nodo){
        if (nodo.getNext() == null) {
            return nodo.getData()+" ]";
        }else{
            return nodo.getData()+" , "+recorrer(nodo.getNext());
        }
    }
}
