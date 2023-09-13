/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Juego {
    List<Jugador> jugadores;
    Revolver revolver;

    public Juego() {
    }
        
    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    public List<Jugador> crearJugadores(){
        Scanner leer = new Scanner(System.in);
        jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad = leer.nextInt();
        
        if (cantidad<1 || cantidad>6) {
            cantidad = 6;
            
        }
        
        for (int i = 0; i < cantidad; i++) {
           Jugador jugador = new Jugador(i+1);
           jugadores.add(jugador);
            
        }
        for (Jugador juga : jugadores) {
            System.out.println(juga);
        }
        return jugadores;

    
    }
    public void llenarJuego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;

    }
    
    public void ronda(){
        
        for (Jugador jugadores : jugadores) {
            boolean fin = jugadores.disparar(revolver);
            
            if(fin){
                System.out.println("El " + jugadores.getNombre() + " se mojó");
                System.out.println("El juego ha finalizado");
            }
            
        }
    
    }
    
}
