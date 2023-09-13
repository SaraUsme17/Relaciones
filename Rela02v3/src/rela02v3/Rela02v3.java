/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela02v3;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.List;

/**
 *
 * @author user
 */
public class Rela02v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugador j = new Jugador();
        Revolver r = new Revolver();
        r.llenarRevolver();
        System.out.println(r);
//        System.out.println(j.disparar(r));
        Juego ju = new Juego();
        List<Jugador> jugadores = ju.crearJugadores();
        ju.llenarJuego(jugadores, r);
        ju.ronda();
    
}

}
