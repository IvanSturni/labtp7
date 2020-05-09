/*
 */
package labtp7;

import java.util.ArrayList;

/**
 *
 * @author Leandro Sturniolo
 */
public class Alumno {
    private ArrayList<Materia> materiasInscripto;
    private int legajo;
    private String apellido;
    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasInscripto = new ArrayList<>();
    }

    public void agregarMateria(Materia m) {
        if (!(this.materiasInscripto.contains(m))) {
            this.materiasInscripto.add(m);
        }
    }
    
    public int cantidadMaterias() {
        return this.materiasInscripto.size();
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
