/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author user
 */
public class Voto {
    private Alumno alumnoQueVota;
    private List<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoQueVota, List<Alumno> alumnosVotados) {
        this.alumnoQueVota = alumnoQueVota;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoQueVota() {
        return alumnoQueVota;
    }

    public void setAlumnoQueVota(Alumno alumnoQueVota) {
        this.alumnoQueVota = alumnoQueVota;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoQueVota=" + alumnoQueVota + ", alumnosVotados=" + alumnosVotados + '}';
    }

public void mostrarInfoVotos() {
        System.out.println("Alumno que vota:");
        alumnoQueVota.mostrarInfoVotos();

        System.out.println("Alumnos votados:");
        for (Alumno alumnoVotado : alumnosVotados) {
            alumnoVotado.mostrarInfoVotos();
        }
    }
    
    
}
