package com.example.ParcialArquitectura.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_jugador;

    private String nombre;
    private String posicion;
    private int dorsal;
    private Date Fecha_nacimiento;
    private String nacionalidad;
    private int id_equipo;



    @OneToMany(mappedBy = "id_estadistica")
    private List<EstadisticasJugador> id_estadistica;

    @ManyToOne
    @JoinColumn (name = "id_equipo")
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(int id_jugador, String nombre, String posicion, int dorsal, Date fecha_nacimiento, String nacionalidad, int id_equipo, List<EstadisticasJugador> id_estadistica, Equipo equipo) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        Fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.id_equipo = id_equipo;
        this.id_estadistica = id_estadistica;
        this.equipo = equipo;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public List<EstadisticasJugador> getId_estadistica() {
        return id_estadistica;
    }

    public void setId_estadistica(List<EstadisticasJugador> id_estadistica) {
        this.id_estadistica = id_estadistica;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
