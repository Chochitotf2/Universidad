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
    private Nodo primero;
        
    public void agregar(T dato){
        if (!(primero == null)) {
            agregar(primero).setSiguiente(dato);
        }else{
            primero = new Nodo(dato);
        }
    }
    
    private Nodo agregar(Nodo nodo){
        if (nodo.getSiguiente() == null) {
            return nodo;
        }else{
            return agregar(nodo.getSiguiente());
        }
    }
    
    public void insertar(int pos, T dato){
        if (pos == 0) {
            Nodo aux = new Nodo(dato);
            aux.setSiguienteObj(primero);
            primero = aux;
        }else{
            if (pos <= tamaño()) {
                Nodo aux = insertar(1, pos, primero);
                Nodo item = new Nodo(dato);
                item.setSiguienteObj(aux.getSiguiente());
                insertar(1, pos, primero).setSiguienteObj(item);
            }else{
                System.out.println("La posición no existe");
            }
        }
    }
    
    private Nodo insertar(int cont, int pos, Nodo nodo){
        if (nodo.getSiguiente() != null){
            if (cont == pos) {
                return nodo;
            }else{
                cont++;
                return insertar(cont, pos, nodo.getSiguiente());
            }
        }else{
            return nodo;
        }            
    }
    
    public void borrar(T dato){
        if (dato == primero.getDato()) {
            primero = primero.getSiguiente();
        }else{
            Nodo aux = borrar(dato,primero);
            if (aux.getSiguiente() != null) {
                borrar(dato,primero).setSiguienteObj(aux.getSiguiente().getSiguiente());
            }else{
                borrar(dato,primero).setSiguienteObj(null);
            }            
        }        
    }
    
    private Nodo borrar(T dato, Nodo nodo){
        if (nodo.getSiguiente() != null) {
            if (dato == nodo.getSiguiente().getDato()) {
                return nodo;
            }else{
                return borrar(dato,nodo.getSiguiente());
            } 
        }else{
            return nodo;
        }
                       
    }
    
    public int tamaño(){
        if (primero == null) {
            return 0;
        }else{
            return tamaño(primero);
        }
    }
    
    private int tamaño(Nodo nodo){
        if (nodo.getSiguiente() == null) {
            return 1;
        }else{
            return 1 + tamaño(nodo.getSiguiente());
        }
    }
    
    public String recorrer(){
        if (primero == null) {
            return "Sin elementos";
        }else{
            return "[ "+recorrer(primero);
        }
    }
    private String recorrer(Nodo nodo){
        if (nodo.getSiguiente() == null) {
            return nodo.getDato()+" ]";
        }else{
            return nodo.getDato()+" , "+recorrer(nodo.getSiguiente());
        }
    }
}
