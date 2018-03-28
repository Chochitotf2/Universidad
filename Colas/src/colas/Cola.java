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
            agregar(nodo).setSiguiente(dato);
        }else{
            nodo = new Nodo(dato);
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
            aux.setSiguienteObj(nodo);
            nodo = aux;
        }else{
            if (pos <= tamaño()) {
                Nodo aux = insertar(1, pos, nodo);
                Nodo item = new Nodo(dato);
                item.setSiguienteObj(aux.getSiguiente());
                insertar(1, pos, nodo).setSiguienteObj(item);
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
        if (dato == nodo.getDato()) {
            nodo = nodo.getSiguiente();
        }else{
            Nodo aux = borrar(dato,nodo);
            if (aux.getSiguiente() != null) {
                borrar(dato,nodo).setSiguienteObj(aux.getSiguiente().getSiguiente());
            }else{
                borrar(dato,nodo).setSiguienteObj(null);
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
        if (nodo == null) {
            return 0;
        }else{
            return tamaño(nodo);
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
        if (nodo == null) {
            return "Sin elementos";
        }else{
            return "[ "+recorrer(nodo);
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
