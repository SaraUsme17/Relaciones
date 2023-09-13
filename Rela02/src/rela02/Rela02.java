/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.JuegoServicio;
import Servicio.JugadorServicio;
import Servicio.RevolverServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Rela02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            ArrayList<Jugador> jugadores = new ArrayList();
            Revolver revolver = new Revolver();
            RevolverServicio rs = new RevolverServicio();
            rs.llenarRevolver();
            JuegoServicio js = new JuegoServicio();
            js.llenarJuego(jugadores, revolver);
            Juego juego = new Juego(jugadores, revolver);
            js.ronda(jugadores, revolver);

        
//        RevolverServicio rs = new RevolverServicio();
//        Revolver revolver = new Revolver();
//        rs.llenarRevolver();
//        rs.mojar(revolver);
//        rs.siguienteChorro(revolver);
//        System.out.println(revolver);
    }
    
}
