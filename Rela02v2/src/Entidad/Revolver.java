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
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        this.posicionActual = 0;
        this.posicionAgua = 0;
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {

        this.posicionActual = ((int) (Math.random() * 6 + 1));
        this.posicionAgua = ((int) (Math.random() * 6 + 1));

    }
       
    public boolean mojar() {

        boolean pos = false;
        if (this.posicionActual == this.posicionAgua) {
            pos = true;
        }

//        siguienteChorro(revolver);
        return pos;

    }
    
    public void siguienteChorro() {
        if (this.posicionActual == 6) {
            this.posicionActual =1;

        } else {
           this.posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    

}
