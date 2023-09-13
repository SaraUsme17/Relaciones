/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela03;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.List;

/**
 *
 * @author user
 */
public class Rela03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja baraja = new Baraja();
        baraja.crearBaraja();
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponible());

        List<Carta> mano = baraja.darCartas();
        System.out.println("Mano de cartas: " + mano);

        System.out.println("Cartas disponibles después de dar mano: " + baraja.cartasDisponible());

        System.out.println("Cartas en el montón: " + baraja.cartasMonton());

        System.out.println("Mostrando la baraja:");
        baraja.mostrarBaraja();
    }
    
}
