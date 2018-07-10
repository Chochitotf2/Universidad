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
        
        //Añadir al inicio
        lista.addToStart("Recuerda");
        System.out.println(lista.print());
        
        //Insertar Antes
        lista.insertBefore("Ella", "Que");
        System.out.println(lista.print());
        
        //Insertar Despues        
        lista.insertAfter("Recuerda", "Tu sabes");
        System.out.println(lista.print());
        
        //Remover o eliminar
        lista.remove("no");
        System.out.println(lista.print());
        
        //Remover o eliminar el ultimo elemento
        lista.removeLast();
        System.out.println(lista.print());
        
        //Añadir al Final de la lista
        lista.addToEnd("...");
        System.out.println(lista.print());
        
        //Remover o eliminar el ultimo elemento
        lista.removeLast();
        System.out.println(lista.print());
        
        //Imprime el tamaño actual de la lista
        System.out.println("Tamaño: " + lista.size());
        
        
//        Nodo p = new Nodo(); //primero
//        p.setInfo(1);//Fijar informacion
//        Nodo t = p;//"Puntero"
//        
//        //Añade numeros del 1 al 10
//        for (int i = 2; i <= 10; i++) {
//            Nodo q = new Nodo();
//            q.setInfo(i);
//            t.setLink(q);
//            t = t.getLink();
//        }
//        
//        //Eliminar ultimo elemento
//        //Elimina el numero 10
//        if (p.getLink() == null) {
//            p = null;
//        }else{
//            Nodo q = p;
//            Nodo aux = null;
//            while (q.getLink() != null) {      
//                aux = q;
//                q = q.getLink();
//            }
//            aux.setLink(null);
//        }
//        
//        //Recorrer elementos
//        Nodo a = p;
//        while (a != null) {            
//            System.out.println(a.getInfo());
//            a = a.getLink();
//        }
    }
    
}
