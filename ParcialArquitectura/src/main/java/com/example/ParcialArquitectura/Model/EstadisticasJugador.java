package com.example.ParcialArquitectura.Model;

import jakarta.persistence.*;

@Entity
public class EstadisticasJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estadistica;

    private int id_jugador;
    private int id_partido;
    private int minutos_jugados;
    private int goles;
    private int asistencias;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;

    @ManyToOne
    @JoinColumn (name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn (name = "id_partido")
    private Partido partido;

    public EstadisticasJugador() {
    }

    public EstadisticasJugador(int id_estadistica, int id_jugador, int id_partido, int minutos_jugados, int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas, Jugador jugador, Partido partido) {
        this.id_estadistica = id_estadistica;
        this.id_jugador = id_jugador;
        this.id_partido = id_partido;
        this.minutos_jugados = minutos_jugados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.jugador = jugador;
        this.partido = partido;
    }

    public int getId_estadistica() {
        return id_estadistica;
    }

    public void setId_estadistica(int id_estadistica) {
        this.id_estadistica = id_estadistica;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getMinutos_jugados() {
        return minutos_jugados;
    }

    public void setMinutos_jugados(int minutos_jugados) {
        this.minutos_jugados = minutos_jugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
