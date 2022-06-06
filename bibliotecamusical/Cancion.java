/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerjava.bibliotecamusical;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Cancion {
    private String titulo;
    private Integer id;
    private String genero;
    private Date fecha;
    private Integer duracion;
    private String caratula;
    private String descripcion;

    public Cancion( Integer id, String titulo, String genero, Date fecha, Integer duracion, String caratula, String descripcion) {
        
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }

    Cancion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", id=" + id + ", genero=" + genero + ", fecha=" + fecha + ", duracion=" + duracion + ", caratula=" + caratula + ", descripcion=" + descripcion + '}';
    }
    
           
    
}
