/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Baraja {
    private List<Carta> cartas;

    Scanner leer = new Scanner(System.in);
    List<Carta> salida = new ArrayList();

    public Baraja() {
    }
    
    
    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    public void crearBaraja(){
        cartas = new ArrayList();
        String [] listaPalos = {"espadas", "bastos", "oros", "copas"};
        
        for (int i = 0; i < 12; i++) {
            if (i == 7 || i == 8) continue;
            
            for (String palo : listaPalos) {

                Carta carta = new Carta(i + 1, palo);
                cartas.add(carta);
            }

        }
        
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
        System.out.println(cartas);
    }
    
//    public void eliminar(){
//        List<Carta> cartasAEliminar = new ArrayList();
//
//        for (Carta i : cartas) {
//            if (i.getNum() == 8 || i.getNum() == 9) {
//                cartasAEliminar.add(i);
//            }
//        }
//
//        cartas.removeAll(cartasAEliminar);
//        for (Carta carta : cartas) {
//            System.out.println(carta);
//        }
//    
//    
//    }

    public void barajar(){
    Collections.shuffle(cartas);
    System.out.println(cartas);
}

    public Carta siguienteCarta(){
    Iterator<Carta> iterator = cartas.iterator();

    
        if (iterator.hasNext()) {
            Carta next = iterator.next();
            iterator.remove(); // Opcionalmente, elimina la carta devuelta de la colección
            return next;
        }else{
                System.out.println("No hay mas cartas");
        }
        return null;

    }
    
    public void cartasDisponibles(){
        System.out.println("La cantidad de cartas disponibles es igual a " +  cartas.size());
    
    }

    public List<Carta> darCartas(int cantidad){

        if(cartas.size()<cantidad){
            System.out.println("No hay suficientes cartas para repartir");
        }else{
            System.out.println("Dando cartas");
            for (int i = 0; i < cantidad; i++) {
                Carta dadas = siguienteCarta();
                this.salida.add(dadas);
            }
        
        }
        return this.salida;
    
    }
    
    public void cartasMonton(){
        List<Carta> dadas = this.salida;
        if(dadas == null){
        
            System.out.println("No ha salido ninugna carta aún");
        }else{
        
            System.out.println("Las cartas que han salido son las siguientes");
            for (Carta dada : dadas) {
                System.out.println(dada);

            }

        }
    }

    public void mostarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
        System.out.println("Baraja");
        System.out.println(cartas);
    }     
    
    
    public void menu() {

        System.out.println("Seleccione una opción \n"
                + "1. Crear baraja \n"
                + "2. Barajar \n"
                + "3. Mostrar cartas disponibles \n"
                + "4. Dar cartas \n"
                + "5. Mostrar cartas que ya han salido \n"
                + "6. Mostrar baraja \n"
                + "7. Salir");

    }
    
        public void mostrarMenu(){
        int opc;
        
        do {
            menu();
            opc= leer.nextInt();
            switch(opc){
                case 1:this.crearBaraja();
//                this.eliminar();
                break;
                case 2: this.barajar();
                break;
                case 3: this.cartasDisponibles();
                break;
                case 4:         
                    Scanner leer = new Scanner(System.in);
                    System.out.println("Cuantas cartas desea?");
                    int cantidad = leer.nextInt();
                    this.darCartas(cantidad);
                break;
                case 5: this.cartasMonton();
                break;
                case 6: this.mostarBaraja();
                break;
                case 7: System.out.println("Saliendo....");
                break;
                default:System.out.println("Opción incorrecta");
                break;
            
            }
            
        } while (opc!=7);
        
    
    }
}

