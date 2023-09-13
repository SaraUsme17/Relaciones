/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JuegoServicio {
    
    ArrayList<Jugador> jugadores;
    Scanner leer = new Scanner(System.in);
    Jugador jugador = new Jugador();
    JugadorServicio js = new JugadorServicio();

    public JuegoServicio() {
        
        jugadores = new ArrayList();
    }
    

    
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        int resp;
        System.out.println("Ingrese el número de jugadores (entre 1 y 6");
        resp = leer.nextInt();
        if (resp < 1 && resp > 6) {
            resp = 6;
        }
        
        for (int i = 0; i < resp; i++) {
            jugadores.add(new Jugador(i, "Jugador " + i, false));
        }
        

//        do {
//            System.out.println("Ingrese el número de jugadores (entre 1 y 6");
//            resp = leer.nextInt();
//            if (resp < 1 && resp > 6) {
//                System.out.println("Respuesta incorrecta");
//            }
//        } while (resp < 1 && resp > 6);
        


    }
    
    public void ronda(ArrayList<Jugador> jugadores, Revolver revolver){
         RevolverServicio rs = new RevolverServicio();
    
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: " + jugador.getNombre());

            if (js.disparo(revolver)) {
                System.out.println("¡El jugador " + jugador.getNombre() + " se mojó!");
                return; // Terminar el juego si alguien se mojó
            } else {
                System.out.println("El jugador " + jugador.getNombre() + " pasó el revolver.");
            }
        }
}

}
