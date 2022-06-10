/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arsan.model;

/**
 *
 * @author arsan
 */
public class Videogame {
    private int id;
    private String nombre;
    private Genero genero;
    private double valoracion;
    private boolean jugado;

    public Videogame() {
    }    
       
    public Videogame(int id, String nombre, Genero genero, double valoracion, boolean jugado) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.valoracion = valoracion;
        this.jugado = jugado;
    }

    public Videogame(String nombre, Genero genero, double valoracion, boolean jugado) {
        this.nombre = nombre;
        this.genero = genero;
        this.valoracion = valoracion;
        this.jugado = jugado;
    }
    //llamamos constructor anterior
    public Videogame(String nombre, Genero genero, boolean jugado) {
        this(nombre, genero, 0.0, jugado);
    }    
    //generamos getters and setters de las diferentes constantes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
    //constructor para visualizar los resultados obtenidos
    @Override
    public String toString() {
        return "Nombre del videojuego " + nombre + "id=" + id + ", genero=" + genero + ", valoracion=" + valoracion + ", jugado=" + jugado;
    }
    
}
