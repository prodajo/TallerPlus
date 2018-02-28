package com.tallerplus.objetos;
import java.util.Date;
// objeto para cada una de las citas que tiene un coche en el taller
public class Cita {
    private String matricula;
    private String fechaHora;
    private String descripcion;
    private float precio;
    private String estado;

    public Cita() {
    }

    public String getMatricula() {
        return matricula;
    }

    public Cita(String matricula, String fechaHora, String descripcion, float precio, String estado) {
        this.matricula = matricula;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "cita del vehiculo "+matricula+" para el "+fechaHora+"con precio de reparacion "+precio+" y estado de reparacion "+estado;
    }
    
    
    
}
