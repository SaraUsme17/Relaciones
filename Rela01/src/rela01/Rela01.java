/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela01;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author user
 */
public class Rela01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro("Luna", "Lobo siberiano", 12, "Grande");
        Perro p2 = new Perro("Lola", "Beagle", 15, "Mediano");
        
        Persona persona1 = new Persona("Sara", "Usme", 28, 12345, p1);
        Persona persona2 = new Persona("Camilo", "Casas", 29, 67890, p2);
        System.out.println(persona1);
        System.out.println(persona2);
    }
    
}
