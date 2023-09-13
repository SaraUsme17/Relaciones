/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class Simulador {
    Scanner leer = new Scanner(System.in);
    List<String> listadoNombres= new ArrayList();
    List<Integer> listadoDnis = new ArrayList();
    List<Alumno> listadoAlumnos= new ArrayList();
    
    public List<String> alumnos() {
        String[] nombres = {"Sara", "Andrea", "Carolina", "Juan", "Pedro", "Daniel", "Luis", "Ana", "Carlos", "Luna"};
        String[] apellidos = {"Perez", "Usme", "Parra", "Arevalo", "Garcia", "Lopez", "Gomez", "Ayala", "Ortiz", "Moreno"};
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            String nombreCompleto = nombres[random.nextInt(nombres.length)] + " " + apellidos[random.nextInt(apellidos.length)];
            listadoNombres.add(nombreCompleto);
        }
        
        for (String li : listadoNombres) {
            System.out.println(li);
            
        }
        return listadoNombres;

}   

    public List<Integer> dnis() {
    
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            Integer dni = 1000000000 + random.nextInt(90000000);
            listadoDnis.add(dni);
            
        }
        
        for (Integer l : listadoDnis) {
            System.out.println(l);
        }

        return listadoDnis;

    }
    
    public List<Alumno> crearAlumnos(int cantidad){
        List<String> listadoNombres = alumnos();
        List<Integer> listadoDnis = dnis();


        
        for (int i = 0; i < cantidad; i++) {
//            System.out.println("Ingrese la cantidad de votos para " + listadoNombres.get(i));
//            int cantidadVotos = leer.nextInt();
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(listadoNombres.get(i));
            alumno.setDNI(listadoDnis.get(i));
//            alumno.setCantidadVotos(0);
            listadoAlumnos.add(alumno);
        }
        
        return listadoAlumnos;     
    
    }
    
    public void mostrarAlumnos(){
        //Imprimir listado de alumnos
        for (Alumno li : listadoAlumnos) {
            System.out.println(li);
        }
    }
    
    public void votacion(List<Alumno> listadoAlumnos){
        Random random = new Random();
    
        for (Alumno alumnoQueVota : listadoAlumnos) {
            Set<Alumno> votados = new HashSet();

            
            
            while (votados.size() < 3) {
                int indice = random.nextInt(listadoAlumnos.size());
                Alumno alumnoVotado = listadoAlumnos.get(indice);
                if(alumnoVotado !=alumnoQueVota && !votados.contains(alumnoQueVota)){
                    
                    alumnoVotado.setCantidadVotos(alumnoVotado.getCantidadVotos()+1);
                    votados.add(alumnoVotado);
                
                }

            }
            for (Alumno votado : votados) {
                System.out.println(votados);
            }
//        Voto voto = new Voto(li, alumnosVotados);

            
        }
        

    }
    
    public void menu() {

        System.out.println("Seleccione una opción \n"
                + "1. Generar nombres \n"
                + "2. Generar DNIs \n"
                + "3. Crear alumnos \n"
                + "4. Mostrar alumos \n"
                + "5. Hacer Votación \n"
                + "6.  \n"
                + "7. Salir");

    }
    
        public void mostrarMenu(){
        int opc;
        
        do {
            menu();
            opc= leer.nextInt();
            switch(opc){
                case 1:this.alumnos();
                break;
                case 2: this.dnis();
                break;
                case 3: 
                    System.out.println("Ingrese la cantidad de alumnos que desea crear?");
                    int cantidad = leer.nextInt();
                    this.crearAlumnos(cantidad);
                break;
                case 4: this.mostrarAlumnos();
                break;
                case 5: this.votacion(listadoAlumnos);
                break;
                case 6: 
                break;
                case 7: System.out.println("Saliendo....");
                break;
                default:System.out.println("Opción incorrecta");
                break;
            
            }
            
        } while (opc!=7);
        
    
    }
}
