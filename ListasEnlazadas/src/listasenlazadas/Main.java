/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author PotatoPower
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.addToEnd("Ella");
        lista.addToEnd("no");
        lista.addToEnd("te");
        lista.addToEnd("Ama");
        
        System.out.println(lista.print());
        
        lista.addToStart("Recuerda");
        System.out.println(lista.print());
        
        lista.insertBefore("Ella", "Que");
        System.out.println(lista.print());
        
        lista.insertAfter("Recuerda", "Tu sabes");
        System.out.println(lista.print());
        
        lista.remove("no");
        System.out.println(lista.print());
        
        lista.removeLast();
        System.out.println(lista.print());
        
        lista.addToEnd("...");
        System.out.println(lista.print());
        
        lista.removeLast();
        System.out.println(lista.print());
        
        System.out.println("Tamaño: " + lista.size());
    }
    
}
