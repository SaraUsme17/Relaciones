/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Revolver {
    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    
    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    
    public void llenarRevolver(){
        
        this.posActual = (int)(Math.random()*6+1);
        this.posAgua = (int)(Math.random()*6+1);
        

    
    }
    
    public boolean mojar(){
        
        //Devuelve true si la posición del agua es igual a la posición actual
        return this.posActual == this.posAgua;
    
    }
    
    public void siguienteChorro(){
        if (this.posActual == 6) {
            this.posActual = 1;
        }
        this.posActual++;
    }
    
        @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
}
