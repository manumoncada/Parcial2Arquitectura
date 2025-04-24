package com.example.ParcialArquitectura.Service;


import com.example.ParcialArquitectura.Model.Jugador;
import com.example.ParcialArquitectura.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JugadorService {
    @Autowired
    private JugadorRepository repository;

    public List<Jugador> findAll() { return repository.findAll(); }
    public Jugador findById(Long id) { return repository.findById(id).orElse(null); }
    public Jugador save(Jugador jugador) { return repository.save(jugador); }
    public void delete(Long id) { repository.deleteById(id); }

    public List<Jugador> findByEquipoId(Long idEquipo) {
        return repository.findByIdEquipo(idEquipo);
    }

    public List<Jugador> findByGolesGreaterThan(int goles) {
        return repository.findByGolesGreaterThan(goles);
    }
}
