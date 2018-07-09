/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
public class Lista<T> {
    private Nodo nodo;
    
    //Inserta un elemento al inicio de la lista
    public void addToStart(T dato){
        if (nodo == null) 
            nodo = new Nodo(dato);
        else{
            Nodo aux = new Nodo(dato);
            aux.setLink(nodo);
            this.nodo = aux;
        }            
    }
    
    //Inserta un elemento al final de la lista
    public void addToEnd(T dato){
        if (nodo == null) 
            nodo = new Nodo(dato);
        else
            this.add(nodo).setLink(new Nodo(dato));        
    }
    
    /*
    * Recorre los elemento de manera recursiva y
    * Devuelve el último elemento de la lista
    */
    private Nodo add(Nodo nodo){
        if (nodo.getLink() == null) 
            return nodo;
        else
            return add(nodo.getLink());        
    }
    
    // Inserta antes de un nodo dado como referencia
    public void insertBefore(T ref , T dato){
        if (nodo != null) {
           if(ref == nodo.getInfo())
                this.addToStart(dato);
            else{
                Nodo after = this.getPreviousNode(ref, nodo);
                if (after != null) {
                    Nodo aux = after.getLink();
                    after.setLink(new Nodo(dato));
                    after.getLink().setLink(aux);
                }else 
                    System.out.println("¡Elemento no encontrado! ("+ref+")");            
            } 
        }else
            System.out.println("¡La lista está vacía!");
    }
    
    // Inserta despues de un nodo dado como referencia
    public void insertAfter(T ref, T dato){
        if (nodo != null) {
            if(ref == nodo.getInfo()){
                Nodo aux = nodo.getLink();
                nodo.setLink(new Nodo(dato));
                nodo.getLink().setLink(aux);
            }else{
                Nodo refNodo = this.getNode(ref, nodo);
                if (refNodo != null) {
                    Nodo aux = refNodo.getLink();
                    refNodo.setLink(new Nodo(dato));
                    refNodo.getLink().setLink(aux);
                }else
                    System.out.println("¡Elemento no encontrado! ("+ref+")");
            }
        }else
            System.out.println("¡La lista está vacía!");
    }
    
    //Obtiene el nodo de referencia
    private Nodo getNode(T ref, Nodo nodo){
        if(nodo != null){
            if(nodo.getInfo() == ref)
                return nodo;
            else
                return getNode(ref, nodo.getLink());
        }else
            return null;        
    }
    
    //Obtiene el anterior nodo al de referencia
    private Nodo getPreviousNode(T ref, Nodo nodo){
        if (nodo.getLink() != null) {
            if (nodo.getLink().getInfo() == ref) 
                return nodo;
            else
                return getPreviousNode(ref, nodo.getLink());            
        }else
            return null;        
    }
    
    private Nodo getNodeBeforeTheLast(Nodo nodo){
        if(nodo.getLink().getLink() != null)
            return this.getNodeBeforeTheLast(nodo.getLink());
        else
            return nodo;     
    }
    
    //Elimina un nodo de referencia
    public void remove(T ref){
        if (nodo != null) {
            if (ref == nodo.getInfo()) 
                nodo = nodo.getLink();
            else{
                Nodo aux = this.getPreviousNode(ref, nodo);
                if (aux.getLink() != null) 
                    aux.setLink(aux.getLink().getLink());
                else
                    aux.setLink(null);                
            }               
        }else
            System.out.println("¡La lista está vacía!");
    }
    
    public void removeLast(){
        if (nodo != null) {
            if(nodo.getLink() != null){
                Nodo aux = this.getNodeBeforeTheLast(nodo);
                aux.setLink(null);
            }else
                nodo = null;            
        }else
            System.out.println("¡La lista está vacía!");
    }
    
    public void removeFirst(){
        if (nodo != null) 
            nodo = nodo.getLink();
        else
            System.out.println("¡La lista está vacía!");
    }
    
    //Devuelve el tamaño del la lista
    public int size(){
        if(nodo == null)
            return 0;
        else
            return size(nodo);
    }
    
    //Recorre la lista y por cada nodo suma 1.
    private int size(Nodo nodo){
        if (nodo.getLink() == null) 
            return 1;
        else
            return 1 + size(nodo.getLink());
    }
    
    //Devuelve un String con los elementos de la lista
    public String print(){
        if (nodo == null) {
            return "Sin elementos";
        }else{
            return "[" + print(nodo);
        }        
    }
    
    //Construye un String con los elementos de la lista
    private String print(Nodo nodo){
        if(nodo.getLink() != null)
            return nodo.getInfo() + ", " + print(nodo.getLink());
        else
            return nodo.getInfo() + "]";        
    }
}
