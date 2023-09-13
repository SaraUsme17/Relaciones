/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Revolver;

/**
 *
 * @author user
 */
public class RevolverServicio {
    
    public void llenarRevolver(){
    
        Revolver revolver = new Revolver();
        revolver.setPosicionActual((int)(Math.random()*6+1));
        revolver.setPosicionAgua((int)(Math.random()*6+1));
        System.out.println(revolver.getPosicionActual());
        System.out.println(revolver.getPosicionAgua());
    
    }
    
    public boolean mojar(Revolver revolver){
        
        boolean pos = false;
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) {
            pos = true;
        }
        
        siguienteChorro(revolver);
        return pos;

    
    }
    
    public void siguienteChorro(Revolver revolver) {
        if (revolver.getPosicionActual() == 6) {
            revolver.setPosicionActual(1);

        } else {
            revolver.setPosicionActual((revolver.getPosicionActual() + 1));
        }
    }
    
    public String mostrar(Revolver revolver){
        
        return "Posición actual" + revolver.getPosicionActual() + "Posición agua" + revolver.getPosicionAgua();
    
    }
        
}
