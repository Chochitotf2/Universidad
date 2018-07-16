/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author PotatoPower
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaDobleCircular<Estudiante> lista = new ListaDobleCircular();
        
        while(true){
            System.out.println("\n1. Añadir estudiante\n"
                    + "2. Listar estudiantes\n"
                    + "3. Eliminar estudiante\n"
                    + "4. Buscar estudiante\n"
                    + "5. Aprobados y Reprobados\n"
                    + "6. Salir\n\n");             
            System.out.print("Ingrese una opción: ");
            String opt = scan.next();
            System.out.println("\n\n");

            switch(opt){
                case "1":
                    Estudiante estudiante = new Estudiante();
                    System.out.print("Ingrese el DNI:");
                    String aux = scan.next();
                    estudiante.setCodigo(aux);
                    
                    System.out.print("Ingrese el nombre:");
                    aux = scan.next();
                    estudiante.setNombres(aux);
                    
                    System.out.print("Ingrese el apellido:");
                    aux = scan.next();
                    estudiante.setApellidos(aux);
                    
                    System.out.print("Ingrese el correo:");
                    aux = scan.next();
                    estudiante.setCorreo(aux);
                    
                    System.out.print("Ingrese la nota:");
                    try {
                        aux = scan.next();
                        Double nota = Double.parseDouble(aux);
                        estudiante.setNota(nota);
                    } catch (NumberFormatException e) {
                        System.out.println("¡Nota no válida!");
                        estudiante.setNota(0.00);
                    }
                    
                    if (estudiante.getNota() >= 7.00) 
                        lista.addToStart(estudiante);
                    else
                        lista.addToEnd(estudiante);
                        
                    break;
                case "2":
                    System.out.println("\nListado de Estudiantes");
                    Main.listado(lista);
                    System.out.println("\n");
                    break;
                case "3":
                    Main.listado(lista);
                    System.out.println("\n");
                    System.out.print("Ingrese el indice a eliminar: ");
                    String ind = scan.next();
                    try {
                        int x = Integer.parseInt(ind);
                        lista.remove(x);
                    } catch (NumberFormatException e) {
                        System.out.println("Indice no válido.");
                    }
                    break;
                case "4":
                    System.out.print("Ingrese el código del estudiante:");
                    String refCode = scan.next();
                    boolean band = false;
                    Estudiante auxE = (Estudiante) lista.get(0).getInfo();
                    for (int i = 0; i < lista.size(); i++) {
                        auxE = (Estudiante) lista.get(i).getInfo();
                        if (auxE.getCodigo().equals(refCode)) {
                            band = true;
                            break;
                        }
                    }
                    if (band) {
                        System.out.println("Estudiante encontrado!");
                        System.out.println("Pertenece a: " + auxE.getNombres());
                    }else
                        System.out.println("Estudiante no encontrado.");
                    
                    break;
                case "5":
                    int rep = 0, ap = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        Estudiante auxAR = (Estudiante) lista.get(i).getInfo();
                        if (auxAR.getNota() > 7.00) ap++;
                        else rep++;
                    }
                    System.out.println("Estudiantes aprobados: "+ap);
                    System.out.println("Estudiantes reprobados: "+rep);
                    break;
                case "6":
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
            if(opt.equals("6")) break;
        }
    }
    
    public static void listado(ListaDobleCircular<Estudiante> lista){
        for (int i = 0; i < lista.size(); i++) 
            System.out.println(i + " | " + lista.get(i).getInfo().toString());   
    }
}

