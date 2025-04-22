package com.example.ParcialArquitectura.Model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_equipo;


    private String NombreEquipo;
    private String Ciudad;
    private Date fundacion;


    @OneToMany(mappedBy = "id_jugador")
    private List<Jugador> id_jugador;

    @OneToMany(mappedBy = "id_entrenador")
    private List<Entrenador> id_entrenador;

    @OneToMany(mappedBy = "id_partido")
    private List<Partido> id_partido;


    public Equipo() {
    }
    public Equipo(int id_equipo, String nombreEquipo, String ciudad, Date fundacion, List<Jugador> id_jugador, List<Entrenador> id_entrenador, List<Partido> id_partido) {
        this.id_equipo = id_equipo;
        NombreEquipo = nombreEquipo;
        Ciudad = ciudad;
        this.fundacion = fundacion;
        this.id_jugador = id_jugador;
        this.id_entrenador = id_entrenador;
        this.id_partido = id_partido;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        NombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public List<Jugador> getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(List<Jugador> id_jugador) {
        this.id_jugador = id_jugador;
    }

    public List<Entrenador> getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(List<Entrenador> id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public List<Partido> getId_partido() {
        return id_partido;
    }

    public void setId_partido(List<Partido> id_partido) {
        this.id_partido = id_partido;
    }
}
