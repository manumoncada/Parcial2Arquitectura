package com.example.ParcialArquitectura.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_partido;

    private Date fecha;
    private String estadio;
    private int equipo_local;
    private int equipo_visita;
    private int goles_local;
    private int goles_visita;

    @OneToMany(mappedBy = "id_estadistica")
    private List<EstadisticasJugador> id_estadistica;

    @ManyToOne
    @JoinColumn (name = "id_equipo")
    private Equipo equipo;

    public Partido() {
    }

    public Partido(int id_partido, Date fecha, String estadio, int equipo_local, int equipo_visita, int goles_local, int goles_visita, List<EstadisticasJugador> id_estadistica, Equipo equipo) {
        this.id_partido = id_partido;
        this.fecha = fecha;
        this.estadio = estadio;
        this.equipo_local = equipo_local;
        this.equipo_visita = equipo_visita;
        this.goles_local = goles_local;
        this.goles_visita = goles_visita;
        this.id_estadistica = id_estadistica;
        this.equipo = equipo;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(int equipo_local) {
        this.equipo_local = equipo_local;
    }

    public int getEquipo_visita() {
        return equipo_visita;
    }

    public void setEquipo_visita(int equipo_visita) {
        this.equipo_visita = equipo_visita;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    public int getGoles_visita() {
        return goles_visita;
    }

    public void setGoles_visita(int goles_visita) {
        this.goles_visita = goles_visita;
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
