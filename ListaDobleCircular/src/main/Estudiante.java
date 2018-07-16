/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author PotatoPower
 */

@Getter
@Setter
public class Estudiante {
    private String codigo;
    private String nombres, apellidos;
    private String correo;
    private Double nota;

    @Override
    public String toString() {
        return codigo + " | " + nombres + " | " + apellidos + " | " + correo + " | " + nota;
    }
    
    
}
