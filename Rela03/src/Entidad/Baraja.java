/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Baraja {
    private List<Carta> cartas;
    private int posSiguienteCarta;
    private List<Carta> monton;
    
    Scanner leer = new Scanner(System.in);

    public Baraja() {
        this.posSiguienteCarta = 0;
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
    }
    
    public void crearBaraja(){
        
        String[] Palos = {"Espadas", "Oros", "Copas", "Bastos"};
        
        for (String Palo : Palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, Palo));
                }
            }
        }
            
        }
    
    public void barajar() {
        Collections.shuffle(cartas);
        
    }

    public Carta siguienteCarta() {

        if (this.posSiguienteCarta >= cartas.size()) {
            System.out.println("Ya no quedan más cartas");
            return null;
            
        }         
        
        Carta siguiente = cartas.get(posSiguienteCarta);
        monton.add(siguiente);
        posSiguienteCarta++;
        return siguiente;


    }
    
    public int cartasDisponible(){
        int disponible = cartas.size() -posSiguienteCarta;
        return disponible;
    
    }
    
    public List<Carta> darCartas(){
        System.out.println("Ingrese la cantidad de cartas que desea");
        int cantidad = leer.nextInt();
        int disponible = cartasDisponible();
        if(cantidad>disponible){
            System.out.println("No hay suficientes cartas disponibles");
            return null;
        }
        
        List<Carta> dadas = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            dadas.add(siguienteCarta());
        }
        return dadas;
    
    
    }
    
    public List<Carta> cartasMonton() {
        return monton;
    }

    public void mostrarBaraja() {
        for (int i = posSiguienteCarta; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }
}
    

