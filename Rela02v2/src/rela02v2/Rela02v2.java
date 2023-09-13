/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela02v2;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Rela02v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        Scanner scan = new Scanner(System.in);
Scanner leer = new Scanner(System.in);
Jugador jugador;
Revolver revolver = new Revolver();

        System.out.print("Ingrese la cantidad de jugadores: ");
        int cantidad = leer.nextInt();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            jugadores.add(new Jugador(i, "Jugador " + i, false));;
        }
        
        revolver.llenarRevolver();
        System.out.println(revolver);
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();

    
    }
    
}
