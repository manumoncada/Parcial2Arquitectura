package com.example.ParcialArquitectura.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPartido;

    private LocalDate fecha;
    private String estadio;
    private int golesLocal;
    private int golesVisita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    public Long getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Long idPartido) {
        this.idPartido = idPartido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisita() {
        return golesVisita;
    }

    public void setGolesVisita(int golesVisita) {
        this.golesVisita = golesVisita;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }
}
