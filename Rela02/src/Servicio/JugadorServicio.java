/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;

/**
 *
 * @author user
 */
public class JugadorServicio {
    RevolverServicio rs = new RevolverServicio();
    Jugador jugador = new Jugador();
    
    public boolean disparo(Revolver revolver){
        boolean res = rs.mojar(revolver);
        boolean respmetod = false;
        if(res){
        respmetod=true;
        jugador.setMojado(true); //El jugador es mojado
            System.out.println("El jugador " + jugador.getNombre()+ " ha sido mojado");
        
        }else{
        
            System.out.println("El jugador" + jugador.getNombre()+ " NO ha sido mojado");
        }
        rs.siguienteChorro(revolver);
        return respmetod;
    
    }
}
