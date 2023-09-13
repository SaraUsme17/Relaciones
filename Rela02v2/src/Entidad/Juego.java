/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
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

    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        Collections.shuffle(jugadores);
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        int posicion = 0;
        do {
            Jugador jugador = this.jugadores.get(posicion);
            if (jugador.disparo(this.revolver)) {
                System.out.println("Juego finalizado");
                System.out.println(jugador);
                return;
            }
            System.out.println(jugador);
            System.out.println(this.revolver);
            posicion++;
            if (posicion == this.jugadores.size()) {
                posicion = 0;
            }
        } while (true);
    }

}
