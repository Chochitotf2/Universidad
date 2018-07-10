/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author PotatoPower
 * @param <T>
 */
@Getter
@Setter
public class Nodo<T> {
    private T info;
    private Nodo link;    

    public Nodo(T info) {
        this.info = info;
    }

    public Nodo() { }   
}
