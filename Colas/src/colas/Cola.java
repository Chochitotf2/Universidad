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
    
    private Nodo agregar(Nodo primero){
        if (primero.getSiguiente() == null) {
            return primero;
        }else{
            return agregar(primero.getSiguiente());
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
    
    private Nodo insertar(int cont, int pos, Nodo primero){
        if (primero.getSiguiente() != null){
            if (cont == pos) {
                return primero;
            }else{
                cont++;
                return insertar(cont, pos, primero.getSiguiente());
            }
        }else{
            return primero;
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
    
    private Nodo borrar(T dato, Nodo primero){
        if (primero.getSiguiente() != null) {
            if (dato == primero.getSiguiente().getDato()) {
                return primero;
            }else{
                return borrar(dato,primero.getSiguiente());
            } 
        }else{
            return primero;
        }
                       
    }
    
    public int tamaño(){
        if (primero == null) {
            return 0;
        }else{
            return tamaño(primero);
        }
    }
    
    private int tamaño(Nodo primero){
        if (primero.getSiguiente() == null) {
            return 1;
        }else{
            return 1 + tamaño(primero.getSiguiente());
        }
    }
    
    public String recorrer(){
        if (primero == null) {
            return "Sin elementos";
        }else{
            return "[ "+recorrer(primero);
        }
    }
    private String recorrer(Nodo primero){
        if (primero.getSiguiente() == null) {
            return primero.getDato()+" ]";
        }else{
            return primero.getDato()+" , "+recorrer(primero.getSiguiente());
        }
    }
}
